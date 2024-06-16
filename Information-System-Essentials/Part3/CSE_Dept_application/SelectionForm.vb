Public Class SelectionForm
    Inherits System.Windows.Forms.Form
    Private Sub SelectForm_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles MyBase.Load
        ComboSelection.Items.Add("Faculty Information")
        ComboSelection.Items.Add("Courses Information")
        ComboSelection.Items.Add("Students Information")
        ComboSelection.SelectedIndex = 0
    End Sub

    Private Sub ExitButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ButtonExit.Click
        Application.Exit()
    End Sub

    Private Sub OKButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ButtonOk.Click
        Dim facultyform As New FacultyForm
        Dim studentform As New StudentForm
        Dim courseform As New Course_Form

        If ComboSelection.Text = "Faculty Information" Then
            facultyform.Show()
        ElseIf ComboSelection.Text = "Students Information" Then
            studentform.Show()
        ElseIf ComboSelection.Text = "Courses Information" Then
            courseform.Show()
        End If
    End Sub

End Class