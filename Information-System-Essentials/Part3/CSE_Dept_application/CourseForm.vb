Public Class Course_Form

    Private Sub cmdSelect_Click(sender As Object, e As EventArgs) Handles cmdSelect.Click
        Dim CourseTableApt As New CSE_DEPTDataSetTableAdapters.CourseTableAdapter
        Dim FacultyTableApt As New CSE_DEPTDataSetTableAdapters.FacultyTableAdapter
        Dim strFacultyID As String

        FacultyTableApt.ClearBeforeFill = True
        strFacultyID = FacultyTableApt.FindFacultyIDByName(ComboName.Text)
        If strFacultyID = String.Empty Then
            MessageBox.Show("No matched faculty_id found!")
            Exit Sub
        End If
        CourseTableApt.FillByFacultyID(CSE_DEPTDataSet.Course, strFacultyID)
        If CSE_DEPTDataSet.Course.Count = 0 Then
            MessageBox.Show("No Matched Courses Found!")
            Exit Sub
        End If
    End Sub

    Private Sub Course_Form_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: This line of code loads data into the 'CSE_DEPTDataSet.Student_Course' table. You can move, or remove it, as needed.
        Me.Student_CourseTableAdapter.Fill(Me.CSE_DEPTDataSet.Student_Course)
        ComboName.Items.Add("Ying Bai")
        ComboName.Items.Add("Satish Bhalla")
        ComboName.Items.Add("Black Anderson")
        ComboName.Items.Add("Steve Johnson")
        ComboName.Items.Add("Jenney King")
        ComboName.Items.Add("Alice Brown")
        ComboName.Items.Add("Debby Angles")
        ComboName.Items.Add("Jeff Henry")
        ComboName.SelectedIndex = 0
    End Sub

    Private Sub cmdBack_Click(sender As Object, e As EventArgs) Handles cmdBack.Click
        Me.Close()
    End Sub
End Class
