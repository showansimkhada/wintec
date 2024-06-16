Public Class LoginForm
    Private Sub LoginForm_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: This line of code loads data into the 'CSE_DEPTDataSet.LogIn' table. You can move, or remove it, as needed.
        Me.LogInTableAdapter.Fill(Me.CSE_DEPTDataSet.LogIn)

    End Sub
End Class