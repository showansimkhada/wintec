Public Class FacultyForm
    Private Sub CmdSelect_Click(sender As Object, e As EventArgs) Handles CmdSelect.Click
        Dim FacultyTableApt As New CSE_DEPTDataSetTableAdapters.FacultyTableAdapter
        Dim strName As String

        strName = FindName(ComboBoxFaculty.Text)
        If strName = "No Match" Then
            MessageBox.Show("No Matched Faculty Found!")
        End If
        PhotoBox.SizeMode = PictureBoxSizeMode.StretchImage
        PhotoBox.Image = System.Drawing.Image.FromFile(strName)
        FacultyTableApt.ClearBeforeFill = True
        FacultyTableApt.FillByFacultyName(CSE_DEPTDataSet.Faculty, ComboBoxFaculty.Text)
        If CSE_DEPTDataSet.Faculty.Count = 0 Then
            MessageBox.Show("No matched faculty found!")
            Exit Sub
        End If
    End Sub
    Private Function FindName(ByVal fName As String) As String
        Dim strName As String
        Select Case fName
            Case "Black Anderson"
                strName = "Anderson.jpg"
            Case "Ying Bai"
                strName = "Bai.jpg"
            Case "Satish Bhalla"
                strName = "Satish.jpg"
            Case Is = "Steve Johnson"
                strName = "Johnson.jpg"
            Case Is = "Jenney King"
                strName = "King.jpg"
            Case "Alice Brown"
                strName = "Brown.jpg"
            Case Is = "Debby Angles"
                strName = "Angles.jpg"
            Case Is = "Jeff Henry"
                strName = "Henry.jpg"
            Case Else
                strName = "No Match"
        End Select
        Return strName
    End Function
    Private Sub FacultyForm_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        'TODO: This line of code loads data into the 'CSE_DEPTDataSet.Faculty' table. You can move, or remove it, as needed.
        Me.FacultyTableAdapter.Fill(Me.CSE_DEPTDataSet.Faculty)
        ComboBoxFaculty.Items.Add("Ying Bai")
        ComboBoxFaculty.Items.Add("Satish Bhalla")
        ComboBoxFaculty.Items.Add("Black Anderson")
        ComboBoxFaculty.Items.Add("Steve Johnson")
        ComboBoxFaculty.Items.Add("Jenney King")
        ComboBoxFaculty.Items.Add("Alice Brown")
        ComboBoxFaculty.Items.Add("Debby Angles")
        ComboBoxFaculty.Items.Add("Jeff Henry")
        ComboBoxFaculty.SelectedIndex = 0
    End Sub
    Private Sub cmdBack_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles CmdBack.Click
        Me.Close()
    End Sub
End Class