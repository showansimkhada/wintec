Public Class Course_Form
    Private Sub ComboName_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ComboName.SelectedIndexChanged

    End Sub

    Private Sub Course_Form_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: This line of code loads data into the 'CSE_DEPTDataSet.Student_Course' table. You can move, or remove it, as needed.
        Me.Student_CourseTableAdapter.Fill(Me.CSE_DEPTDataSet.Student_Course)
        'TODO: This line of code loads data into the 'CSE_DEPTDataSet.Course' table. You can move, or remove it, as needed.
        Me.CourseTableAdapter.Fill(Me.CSE_DEPTDataSet.Course)
        ComboName.Items.Add("Ying Bai")
        ComboName.Items.Add("Satish Bhalla")
        ComboName.Items.Add("Black Anderson")
        ComboName.Items.Add("Steve Johnson")
        ComboName.Items.Add("Jenney King")
        ComboName.Items.Add("Alice Brown")
        ComboName.Items.Add("Debby Angles")
        ComboName.Items.Add("Jeff Henry")
        ComboName.SelectedIndex = 0
        ListBox1.Items.Add("TableAdapter Method")
        ListBox1.Items.Add("LINQ and Dataset Method")
        ListBox1.SelectedIndex = 0
    End Sub

    Private Sub cmdSelect_Click(sender As Object, e As EventArgs) Handles cmdSelect.Click
         Sub LINQToDataSet(ByVal facultyID As String)
        CourseTableAdapter.FillByFacultyID(CSE_DEPTDataSet.Course, facultyID)
        Dim courseinfo = From ci In CSE_DEPTDataSet.Course.AsEnumerable()
                         Where ci.Field(Of String)("faculty_id") = facultyID Select ci
        For Each cRow In courseinfo
            txtcoursename.Text = cRow.course
            txtSchedule.Text = cRow.schedule
            txtClassroom.Text = cRow.classroom
            txtCredits.Text = cRow.credit.ToString()
            txtEnrolment.Text = cRow.enrolment.ToString()

        Next
        Dim CourseTableApt As New CSE_DEPTDataSetTableAdapters.CourseTableAdapter
        Dim FacultyTableApt As New CSE_DEPTDataSetTableAdapters.FacultyTableAdapter
        Dim strFacultyID As String = ""
        FacultyTableApt.ClearBeforeFill = True
        strFacultyID = FacultyTableApt.FindFacultyIDByName(ComboName.Text)
        If strFacultyID = String.Empty Then MessageBox.Show("No matched faculty found!")
        If strFacultyID = String.Empty Then
            MessageBox.Show("No matched faculty found!")
            Exit Sub
            CourseTableApt.ClearBeforeFill = True
            If ComboMethod.Text = "LINQ and DataSet Method" Then
                LINQToDataSet(strFacultyID)
            Else
                CourseTableApt.FillByFacultyID(CSE_DEPTDataSet.Course, strFacultyID)
                If CSE_DEPTDataSet.Course.Count = 0 Then MessageBox.Show("No matched courses found")
                Exit Sub
            End If
        End If
    End Sub
End Class
