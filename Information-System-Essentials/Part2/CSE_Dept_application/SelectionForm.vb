Public Class SelectionForm
    Private Sub SelectionForm_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        ComboSelection.Items.Add("Faculty Information")
        ComboSelection.Items.Add("Course Information")
        ComboSelection.Items.Add("Student Information")
        ComboSelection.SelectedIndex = 0
    End Sub

    Private Sub ButtonExit_Click(sender As Object, e As EventArgs) Handles ButtonExit.Click
        Application.Exit()
    End Sub

    Private Sub ButtonOk_Click(sender As Object, e As EventArgs) Handles ButtonOk.Click
        Dim FacultyForm As New FacultyForm
        Dim CourseForm As New Course_Form

        If (ComboSelection.Text = "Faculty Information") Then
            FacultyForm.Show()
        ElseIf (ComboSelection.Text = "Course Information") Then
            CourseForm.Show()
        End If

    End Sub

End Class