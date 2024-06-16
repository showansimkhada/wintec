Public Class LoginForm
    Private Sub cmdLogIn_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnLogin.Click
        Dim LogInTableApt As New CSE_DEPTDataSetTableAdapters.LogInTableAdapter
        Dim selForm As New SelectionForm

        LogInTableApt.ClearBeforeFill = True
        LogInTableApt.FillByUsernamePassword(CSE_DEPTDataSet.LogIn, TextBoxUsername.Text, TextBoxPassword.Text)
        If CSE_DEPTDataSet.LogIn.Count = 0 Then
            MessageBox.Show("No matched username/password found!")
            TextBoxUsername.Focus()
            Exit Sub
        End If
        selForm.Show()
        Me.Hide()
    End Sub
    Private Sub cmdCancel_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCancel.Click
        Me.Close()
    End Sub

End Class