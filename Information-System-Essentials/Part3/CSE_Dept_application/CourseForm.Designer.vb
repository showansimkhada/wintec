<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Course_Form
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.ComboName = New System.Windows.Forms.ComboBox()
        Me.CourseBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.CSE_DEPTDataSet = New CSE_Dept_application.CSE_DEPTDataSet()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.ListBox1 = New System.Windows.Forms.ListBox()
        Me.GroupBox3 = New System.Windows.Forms.GroupBox()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtCourse_Id = New System.Windows.Forms.TextBox()
        Me.txtEnrolment = New System.Windows.Forms.TextBox()
        Me.txtSchedule = New System.Windows.Forms.TextBox()
        Me.txtClassroom = New System.Windows.Forms.TextBox()
        Me.txtCredits = New System.Windows.Forms.TextBox()
        Me.txtcoursename = New System.Windows.Forms.TextBox()
        Me.cmdSelect = New System.Windows.Forms.Button()
        Me.cmdInsert = New System.Windows.Forms.Button()
        Me.cmdBack = New System.Windows.Forms.Button()
        Me.CourseTableAdapter = New CSE_Dept_application.CSE_DEPTDataSetTableAdapters.CourseTableAdapter()
        Me.CourseStudentCourseBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.Student_CourseTableAdapter = New CSE_Dept_application.CSE_DEPTDataSetTableAdapters.Student_CourseTableAdapter()
        Me.GroupBox1.SuspendLayout()
        CType(Me.CourseBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.CSE_DEPTDataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        CType(Me.CourseStudentCourseBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.ComboName)
        Me.GroupBox1.Controls.Add(Me.Label1)
        Me.GroupBox1.Location = New System.Drawing.Point(12, 12)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(236, 100)
        Me.GroupBox1.TabIndex = 0
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Faculty Name"
        '
        'ComboName
        '
        Me.ComboName.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CourseBindingSource, "faculty_id", True))
        Me.ComboName.FormattingEnabled = True
        Me.ComboName.Location = New System.Drawing.Point(99, 23)
        Me.ComboName.Name = "ComboName"
        Me.ComboName.Size = New System.Drawing.Size(121, 21)
        Me.ComboName.TabIndex = 1
        '
        'CourseBindingSource
        '
        Me.CourseBindingSource.DataMember = "Course"
        Me.CourseBindingSource.DataSource = Me.CSE_DEPTDataSet
        '
        'CSE_DEPTDataSet
        '
        Me.CSE_DEPTDataSet.DataSetName = "CSE_DEPTDataSet"
        Me.CSE_DEPTDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(21, 26)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(72, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Faculty Name"
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.ListBox1)
        Me.GroupBox2.Location = New System.Drawing.Point(12, 125)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(208, 200)
        Me.GroupBox2.TabIndex = 1
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Course List"
        '
        'ListBox1
        '
        Me.ListBox1.DataSource = Me.CourseStudentCourseBindingSource
        Me.ListBox1.FormattingEnabled = True
        Me.ListBox1.Location = New System.Drawing.Point(6, 18)
        Me.ListBox1.Name = "ListBox1"
        Me.ListBox1.Size = New System.Drawing.Size(196, 173)
        Me.ListBox1.TabIndex = 2
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.Label7)
        Me.GroupBox3.Controls.Add(Me.Label6)
        Me.GroupBox3.Controls.Add(Me.Label5)
        Me.GroupBox3.Controls.Add(Me.Label4)
        Me.GroupBox3.Controls.Add(Me.Label3)
        Me.GroupBox3.Controls.Add(Me.Label2)
        Me.GroupBox3.Controls.Add(Me.txtCourse_Id)
        Me.GroupBox3.Controls.Add(Me.txtEnrolment)
        Me.GroupBox3.Controls.Add(Me.txtSchedule)
        Me.GroupBox3.Controls.Add(Me.txtClassroom)
        Me.GroupBox3.Controls.Add(Me.txtCredits)
        Me.GroupBox3.Controls.Add(Me.txtcoursename)
        Me.GroupBox3.Location = New System.Drawing.Point(326, 125)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(200, 200)
        Me.GroupBox3.TabIndex = 1
        Me.GroupBox3.TabStop = False
        Me.GroupBox3.Text = "Course Info"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(7, 159)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(55, 13)
        Me.Label7.TabIndex = 11
        Me.Label7.Text = "Course_Id"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(7, 133)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(54, 13)
        Me.Label6.TabIndex = 10
        Me.Label6.Text = "Enrolment"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(7, 111)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(52, 13)
        Me.Label5.TabIndex = 9
        Me.Label5.Text = "Schedule"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(7, 88)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(55, 13)
        Me.Label4.TabIndex = 8
        Me.Label4.Text = "Classroom"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(7, 58)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(39, 13)
        Me.Label3.TabIndex = 7
        Me.Label3.Text = "Credits"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(7, 29)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(71, 13)
        Me.Label2.TabIndex = 6
        Me.Label2.Text = "Course Name"
        '
        'txtCourse_Id
        '
        Me.txtCourse_Id.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CourseBindingSource, "course_id", True))
        Me.txtCourse_Id.Location = New System.Drawing.Point(78, 156)
        Me.txtCourse_Id.Name = "txtCourse_Id"
        Me.txtCourse_Id.Size = New System.Drawing.Size(100, 20)
        Me.txtCourse_Id.TabIndex = 5
        '
        'txtEnrolment
        '
        Me.txtEnrolment.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CourseBindingSource, "enrolment", True))
        Me.txtEnrolment.Location = New System.Drawing.Point(78, 130)
        Me.txtEnrolment.Name = "txtEnrolment"
        Me.txtEnrolment.Size = New System.Drawing.Size(100, 20)
        Me.txtEnrolment.TabIndex = 4
        '
        'txtSchedule
        '
        Me.txtSchedule.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CourseBindingSource, "schedule", True))
        Me.txtSchedule.Location = New System.Drawing.Point(78, 104)
        Me.txtSchedule.Name = "txtSchedule"
        Me.txtSchedule.Size = New System.Drawing.Size(100, 20)
        Me.txtSchedule.TabIndex = 3
        '
        'txtClassroom
        '
        Me.txtClassroom.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CourseBindingSource, "classroom", True))
        Me.txtClassroom.Location = New System.Drawing.Point(78, 81)
        Me.txtClassroom.Name = "txtClassroom"
        Me.txtClassroom.Size = New System.Drawing.Size(100, 20)
        Me.txtClassroom.TabIndex = 2
        '
        'txtCredits
        '
        Me.txtCredits.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CourseBindingSource, "credit", True))
        Me.txtCredits.Location = New System.Drawing.Point(78, 55)
        Me.txtCredits.Name = "txtCredits"
        Me.txtCredits.Size = New System.Drawing.Size(100, 20)
        Me.txtCredits.TabIndex = 1
        '
        'txtcoursename
        '
        Me.txtcoursename.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.CourseBindingSource, "course", True))
        Me.txtcoursename.Location = New System.Drawing.Point(78, 29)
        Me.txtcoursename.Name = "txtcoursename"
        Me.txtcoursename.Size = New System.Drawing.Size(100, 20)
        Me.txtcoursename.TabIndex = 0
        '
        'cmdSelect
        '
        Me.cmdSelect.Location = New System.Drawing.Point(377, 12)
        Me.cmdSelect.Name = "cmdSelect"
        Me.cmdSelect.Size = New System.Drawing.Size(75, 23)
        Me.cmdSelect.TabIndex = 2
        Me.cmdSelect.Text = "Select"
        Me.cmdSelect.UseVisualStyleBackColor = True
        '
        'cmdInsert
        '
        Me.cmdInsert.Location = New System.Drawing.Point(377, 41)
        Me.cmdInsert.Name = "cmdInsert"
        Me.cmdInsert.Size = New System.Drawing.Size(75, 23)
        Me.cmdInsert.TabIndex = 3
        Me.cmdInsert.Text = "Insert"
        Me.cmdInsert.UseVisualStyleBackColor = True
        '
        'cmdBack
        '
        Me.cmdBack.Location = New System.Drawing.Point(377, 70)
        Me.cmdBack.Name = "cmdBack"
        Me.cmdBack.Size = New System.Drawing.Size(75, 23)
        Me.cmdBack.TabIndex = 4
        Me.cmdBack.Text = "Back"
        Me.cmdBack.UseVisualStyleBackColor = True
        '
        'CourseTableAdapter
        '
        Me.CourseTableAdapter.ClearBeforeFill = True
        '
        'CourseStudentCourseBindingSource
        '
        Me.CourseStudentCourseBindingSource.DataMember = "CourseStudentCourse"
        Me.CourseStudentCourseBindingSource.DataSource = Me.CourseBindingSource
        '
        'Student_CourseTableAdapter
        '
        Me.Student_CourseTableAdapter.ClearBeforeFill = True
        '
        'Course_Form
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(637, 354)
        Me.Controls.Add(Me.cmdBack)
        Me.Controls.Add(Me.cmdInsert)
        Me.Controls.Add(Me.cmdSelect)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox3)
        Me.Controls.Add(Me.GroupBox1)
        Me.Name = "Course_Form"
        Me.Text = "Course Form"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        CType(Me.CourseBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.CSE_DEPTDataSet, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        CType(Me.CourseStudentCourseBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents GroupBox3 As GroupBox
    Friend WithEvents ComboName As ComboBox
    Friend WithEvents Label1 As Label
    Friend WithEvents ListBox1 As ListBox
    Friend WithEvents txtcoursename As TextBox
    Friend WithEvents Label7 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents txtCourse_Id As TextBox
    Friend WithEvents txtEnrolment As TextBox
    Friend WithEvents txtSchedule As TextBox
    Friend WithEvents txtClassroom As TextBox
    Friend WithEvents txtCredits As TextBox
    Friend WithEvents cmdSelect As Button
    Friend WithEvents cmdInsert As Button
    Friend WithEvents cmdBack As Button
    Friend WithEvents CSE_DEPTDataSet As CSE_DEPTDataSet
    Friend WithEvents CourseBindingSource As BindingSource
    Friend WithEvents CourseTableAdapter As CSE_DEPTDataSetTableAdapters.CourseTableAdapter
    Friend WithEvents CourseStudentCourseBindingSource As BindingSource
    Friend WithEvents Student_CourseTableAdapter As CSE_DEPTDataSetTableAdapters.Student_CourseTableAdapter
End Class
