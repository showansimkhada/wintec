<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class StudentForm
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Me.StudentNameBox = New System.Windows.Forms.GroupBox()
        Me.ComboName = New System.Windows.Forms.ComboBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.CourseSelectedBox = New System.Windows.Forms.GroupBox()
        Me.CourseList = New System.Windows.Forms.ListBox()
        Me.StudentBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.CSE_DEPTDataSet = New CSE_Dept_application.CSE_DEPTDataSet()
        Me.PhotoBox = New System.Windows.Forms.PictureBox()
        Me.StudentInfoBox = New System.Windows.Forms.GroupBox()
        Me.txtEmail = New System.Windows.Forms.TextBox()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtCredits = New System.Windows.Forms.TextBox()
        Me.txtMajor = New System.Windows.Forms.TextBox()
        Me.txtGPA = New System.Windows.Forms.TextBox()
        Me.txtSchoolYear = New System.Windows.Forms.TextBox()
        Me.txtID = New System.Windows.Forms.TextBox()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.cmdSelect = New System.Windows.Forms.Button()
        Me.cmdInsert = New System.Windows.Forms.Button()
        Me.cmdBack = New System.Windows.Forms.Button()
        Me.StudentTableAdapter = New CSE_Dept_application.CSE_DEPTDataSetTableAdapters.StudentTableAdapter()
        Me.StudentNameBox.SuspendLayout()
        Me.CourseSelectedBox.SuspendLayout()
        CType(Me.StudentBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.CSE_DEPTDataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PhotoBox, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.StudentInfoBox.SuspendLayout()
        Me.SuspendLayout()
        '
        'StudentNameBox
        '
        Me.StudentNameBox.Controls.Add(Me.ComboName)
        Me.StudentNameBox.Controls.Add(Me.Label1)
        Me.StudentNameBox.Location = New System.Drawing.Point(12, 12)
        Me.StudentNameBox.Name = "StudentNameBox"
        Me.StudentNameBox.Size = New System.Drawing.Size(237, 80)
        Me.StudentNameBox.TabIndex = 25
        Me.StudentNameBox.TabStop = False
        Me.StudentNameBox.Text = "Student Name"
        '
        'ComboName
        '
        Me.ComboName.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.ComboName.FormattingEnabled = True
        Me.ComboName.Location = New System.Drawing.Point(95, 31)
        Me.ComboName.Name = "ComboName"
        Me.ComboName.Size = New System.Drawing.Size(127, 21)
        Me.ComboName.TabIndex = 1
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(2, 31)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(96, 16)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Student Name"
        Me.Label1.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'CourseSelectedBox
        '
        Me.CourseSelectedBox.Controls.Add(Me.CourseList)
        Me.CourseSelectedBox.Location = New System.Drawing.Point(291, 12)
        Me.CourseSelectedBox.Name = "CourseSelectedBox"
        Me.CourseSelectedBox.Size = New System.Drawing.Size(250, 128)
        Me.CourseSelectedBox.TabIndex = 26
        Me.CourseSelectedBox.TabStop = False
        Me.CourseSelectedBox.Text = "Course Selected"
        '
        'CourseList
        '
        Me.CourseList.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.CourseList.DataSource = Me.StudentBindingSource
        Me.CourseList.Location = New System.Drawing.Point(35, 19)
        Me.CourseList.Name = "CourseList"
        Me.CourseList.Size = New System.Drawing.Size(179, 93)
        Me.CourseList.TabIndex = 0
        '
        'StudentBindingSource
        '
        Me.StudentBindingSource.DataMember = "Student"
        Me.StudentBindingSource.DataSource = Me.CSE_DEPTDataSet
        '
        'CSE_DEPTDataSet
        '
        Me.CSE_DEPTDataSet.DataSetName = "CSE_DEPTDataSet"
        Me.CSE_DEPTDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'PhotoBox
        '
        Me.PhotoBox.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.PhotoBox.Location = New System.Drawing.Point(17, 143)
        Me.PhotoBox.Name = "PhotoBox"
        Me.PhotoBox.Size = New System.Drawing.Size(173, 180)
        Me.PhotoBox.TabIndex = 31
        Me.PhotoBox.TabStop = False
        '
        'StudentInfoBox
        '
        Me.StudentInfoBox.Controls.Add(Me.txtEmail)
        Me.StudentInfoBox.Controls.Add(Me.Label6)
        Me.StudentInfoBox.Controls.Add(Me.Label5)
        Me.StudentInfoBox.Controls.Add(Me.Label4)
        Me.StudentInfoBox.Controls.Add(Me.Label3)
        Me.StudentInfoBox.Controls.Add(Me.Label2)
        Me.StudentInfoBox.Controls.Add(Me.txtCredits)
        Me.StudentInfoBox.Controls.Add(Me.txtMajor)
        Me.StudentInfoBox.Controls.Add(Me.txtGPA)
        Me.StudentInfoBox.Controls.Add(Me.txtSchoolYear)
        Me.StudentInfoBox.Controls.Add(Me.txtID)
        Me.StudentInfoBox.Controls.Add(Me.Label7)
        Me.StudentInfoBox.Location = New System.Drawing.Point(291, 155)
        Me.StudentInfoBox.Name = "StudentInfoBox"
        Me.StudentInfoBox.Size = New System.Drawing.Size(250, 192)
        Me.StudentInfoBox.TabIndex = 32
        Me.StudentInfoBox.TabStop = False
        Me.StudentInfoBox.Text = "Student Information"
        '
        'txtEmail
        '
        Me.txtEmail.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.StudentBindingSource, "email", True))
        Me.txtEmail.Location = New System.Drawing.Point(94, 154)
        Me.txtEmail.Name = "txtEmail"
        Me.txtEmail.Size = New System.Drawing.Size(120, 20)
        Me.txtEmail.TabIndex = 11
        '
        'Label6
        '
        Me.Label6.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label6.Location = New System.Drawing.Point(8, 132)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(84, 16)
        Me.Label6.TabIndex = 8
        Me.Label6.Text = "Credits"
        Me.Label6.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'Label5
        '
        Me.Label5.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.Location = New System.Drawing.Point(8, 106)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(80, 16)
        Me.Label5.TabIndex = 6
        Me.Label5.Text = "Major"
        Me.Label5.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'Label4
        '
        Me.Label4.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.Location = New System.Drawing.Point(8, 77)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(80, 16)
        Me.Label4.TabIndex = 4
        Me.Label4.Text = "GPA"
        Me.Label4.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(8, 51)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(80, 16)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = "School Year"
        Me.Label3.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'Label2
        '
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(8, 24)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(80, 16)
        Me.Label2.TabIndex = 0
        Me.Label2.Text = "Student ID"
        Me.Label2.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'txtCredits
        '
        Me.txtCredits.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.StudentBindingSource, "credits", True))
        Me.txtCredits.Location = New System.Drawing.Point(94, 128)
        Me.txtCredits.Name = "txtCredits"
        Me.txtCredits.Size = New System.Drawing.Size(120, 20)
        Me.txtCredits.TabIndex = 9
        '
        'txtMajor
        '
        Me.txtMajor.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.StudentBindingSource, "major", True))
        Me.txtMajor.Location = New System.Drawing.Point(94, 102)
        Me.txtMajor.Name = "txtMajor"
        Me.txtMajor.Size = New System.Drawing.Size(120, 20)
        Me.txtMajor.TabIndex = 7
        '
        'txtGPA
        '
        Me.txtGPA.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.StudentBindingSource, "gpa", True))
        Me.txtGPA.Location = New System.Drawing.Point(94, 76)
        Me.txtGPA.Name = "txtGPA"
        Me.txtGPA.Size = New System.Drawing.Size(120, 20)
        Me.txtGPA.TabIndex = 5
        '
        'txtSchoolYear
        '
        Me.txtSchoolYear.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.StudentBindingSource, "schoolYear", True))
        Me.txtSchoolYear.Location = New System.Drawing.Point(94, 50)
        Me.txtSchoolYear.Name = "txtSchoolYear"
        Me.txtSchoolYear.Size = New System.Drawing.Size(120, 20)
        Me.txtSchoolYear.TabIndex = 3
        '
        'txtID
        '
        Me.txtID.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.StudentBindingSource, "student_id", True))
        Me.txtID.Location = New System.Drawing.Point(94, 24)
        Me.txtID.Name = "txtID"
        Me.txtID.Size = New System.Drawing.Size(120, 20)
        Me.txtID.TabIndex = 1
        '
        'Label7
        '
        Me.Label7.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label7.ImageAlign = System.Drawing.ContentAlignment.TopCenter
        Me.Label7.Location = New System.Drawing.Point(8, 155)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(80, 16)
        Me.Label7.TabIndex = 10
        Me.Label7.Text = "Email"
        Me.Label7.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'cmdSelect
        '
        Me.cmdSelect.Location = New System.Drawing.Point(17, 355)
        Me.cmdSelect.Name = "cmdSelect"
        Me.cmdSelect.Size = New System.Drawing.Size(75, 23)
        Me.cmdSelect.TabIndex = 33
        Me.cmdSelect.Text = "Select"
        Me.cmdSelect.UseVisualStyleBackColor = True
        '
        'cmdInsert
        '
        Me.cmdInsert.Location = New System.Drawing.Point(119, 355)
        Me.cmdInsert.Name = "cmdInsert"
        Me.cmdInsert.Size = New System.Drawing.Size(75, 23)
        Me.cmdInsert.TabIndex = 34
        Me.cmdInsert.Text = "Insert"
        Me.cmdInsert.UseVisualStyleBackColor = True
        '
        'cmdBack
        '
        Me.cmdBack.Location = New System.Drawing.Point(216, 355)
        Me.cmdBack.Name = "cmdBack"
        Me.cmdBack.Size = New System.Drawing.Size(75, 23)
        Me.cmdBack.TabIndex = 35
        Me.cmdBack.Text = "Back"
        Me.cmdBack.UseVisualStyleBackColor = True
        '
        'StudentTableAdapter
        '
        Me.StudentTableAdapter.ClearBeforeFill = True
        '
        'StudentForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(554, 385)
        Me.Controls.Add(Me.cmdBack)
        Me.Controls.Add(Me.cmdInsert)
        Me.Controls.Add(Me.cmdSelect)
        Me.Controls.Add(Me.StudentInfoBox)
        Me.Controls.Add(Me.PhotoBox)
        Me.Controls.Add(Me.CourseSelectedBox)
        Me.Controls.Add(Me.StudentNameBox)
        Me.Name = "StudentForm"
        Me.Text = "StudentForm"
        Me.StudentNameBox.ResumeLayout(False)
        Me.CourseSelectedBox.ResumeLayout(False)
        CType(Me.StudentBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.CSE_DEPTDataSet, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PhotoBox, System.ComponentModel.ISupportInitialize).EndInit()
        Me.StudentInfoBox.ResumeLayout(False)
        Me.StudentInfoBox.PerformLayout()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents StudentNameBox As GroupBox
    Friend WithEvents ComboName As ComboBox
    Friend WithEvents Label1 As Label
    Friend WithEvents CourseSelectedBox As GroupBox
    Friend WithEvents CourseList As ListBox
    Friend WithEvents PhotoBox As PictureBox
    Friend WithEvents StudentInfoBox As GroupBox
    Friend WithEvents txtEmail As TextBox
    Friend WithEvents Label6 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents txtCredits As TextBox
    Friend WithEvents txtMajor As TextBox
    Friend WithEvents txtGPA As TextBox
    Friend WithEvents txtSchoolYear As TextBox
    Friend WithEvents txtID As TextBox
    Friend WithEvents Label7 As Label
    Friend WithEvents cmdSelect As Button
    Friend WithEvents cmdInsert As Button
    Friend WithEvents cmdBack As Button
    Friend WithEvents CSE_DEPTDataSet As CSE_DEPTDataSet
    Friend WithEvents StudentBindingSource As BindingSource
    Friend WithEvents StudentTableAdapter As CSE_DEPTDataSetTableAdapters.StudentTableAdapter
End Class
