Public Class StudentForm
    Private Sub StudentForm_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        ComboName.Items.Add("Erica Johnson")
        ComboName.Items.Add("Ashly Jade")
        ComboName.Items.Add("Holes Smith")
        ComboName.Items.Add("Andrew Woods")
        ComboName.Items.Add("Blue Valley")
        ComboName.SelectedIndex = 0
    End Sub
    Private Function FindName(ByVal sName As String) As String
        Dim strName As String

        Select Case sName
            Case "Erica Johnson"
                strName = "Erica.jpg"
            Case "Ashly Jade"
                strName = "Ashly.jpg"
            Case "Holes Smith"
                strName = "Holes.jpg"
            Case Is = "Andrew Woods"
                strName = "Andrew.jpg"
            Case Is = "Blue Valley"
                strName = "Blue.jpg"
            Case Else
                strName = "No Match"
        End Select
        Return strName

    End Function
End Class