<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class FacultyForm
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
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.ComboBoxFaculty = New System.Windows.Forms.ComboBox()
        Me.CmdSelect = New System.Windows.Forms.Button()
        Me.CmdInsert = New System.Windows.Forms.Button()
        Me.CmdUpdate = New System.Windows.Forms.Button()
        Me.CmdDelete = New System.Windows.Forms.Button()
        Me.CmdBack = New System.Windows.Forms.Button()
        Me.PhotoBox = New System.Windows.Forms.PictureBox()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.FacultyIDLabel = New System.Windows.Forms.TextBox()
        Me.FacultyBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.CSE_DEPTDataSet = New CSE_Dept_application.CSE_DEPTDataSet()
        Me.FacultyNameLabel = New System.Windows.Forms.TextBox()
        Me.EmailLabel = New System.Windows.Forms.TextBox()
        Me.CollegeLabel = New System.Windows.Forms.TextBox()
        Me.PhoneLabel = New System.Windows.Forms.TextBox()
        Me.OfficeLabel = New System.Windows.Forms.TextBox()
        Me.TitleLabel = New System.Windows.Forms.TextBox()
        Me.FacultyTableAdapter = New CSE_Dept_application.CSE_DEPTDataSetTableAdapters.FacultyTableAdapter()
        Me.GroupBox1.SuspendLayout()
        CType(Me.PhotoBox, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox2.SuspendLayout()
        CType(Me.FacultyBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.CSE_DEPTDataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.Label1)
        Me.GroupBox1.Controls.Add(Me.ComboBoxFaculty)
        Me.GroupBox1.Location = New System.Drawing.Point(275, 12)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(256, 124)
        Me.GroupBox1.TabIndex = 1
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Faculty Name"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(17, 31)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(72, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Faculty Name"
        '
        'ComboBoxFaculty
        '
        Me.ComboBoxFaculty.FormattingEnabled = True
        Me.ComboBoxFaculty.Location = New System.Drawing.Point(114, 28)
        Me.ComboBoxFaculty.Name = "ComboBoxFaculty"
        Me.ComboBoxFaculty.Size = New System.Drawing.Size(138, 21)
        Me.ComboBoxFaculty.TabIndex = 0
        '
        'CmdSelect
        '
        Me.CmdSelect.Location = New System.Drawing.Point(113, 357)
        Me.CmdSelect.Name = "CmdSelect"
        Me.CmdSelect.Size = New System.Drawing.Size(75, 23)
        Me.CmdSelect.TabIndex = 7
        Me.CmdSelect.Text = "Select"
        Me.CmdSelect.UseVisualStyleBackColor = True
        '
        'CmdInsert
        '
        Me.CmdInsert.Location = New System.Drawing.Point(203, 357)
        Me.CmdInsert.Name = "CmdInsert"
        Me.CmdInsert.Size = New System.Drawing.Size(75, 23)
        Me.CmdInsert.TabIndex = 8
        Me.CmdInsert.Text = "Insert"
        Me.CmdInsert.UseVisualStyleBackColor = True
        '
        'CmdUpdate
        '
        Me.CmdUpdate.Location = New System.Drawing.Point(302, 357)
        Me.CmdUpdate.Name = "CmdUpdate"
        Me.CmdUpdate.Size = New System.Drawing.Size(75, 23)
        Me.CmdUpdate.TabIndex = 9
        Me.CmdUpdate.Text = "Update"
        Me.CmdUpdate.UseVisualStyleBackColor = True
        '
        'CmdDelete
        '
        Me.CmdDelete.Location = New System.Drawing.Point(396, 357)
        Me.CmdDelete.Name = "CmdDelete"
        Me.CmdDelete.Size = New System.Drawing.Size(75, 23)
        Me.CmdDelete.TabIndex = 10
        Me.CmdDelete.Text = "Delete"
        Me.CmdDelete.UseVisualStyleBackColor = True
        '
        'CmdBack
        '
        Me.CmdBack.Location = New System.Drawing.Point(477, 357)
        Me.CmdBack.Name = "CmdBack"
        Me.CmdBack.Size = New System.Drawing.Size(75, 23)
        Me.CmdBack.TabIndex = 11
        Me.CmdBack.Text = "Back"
        Me.CmdBack.UseVisualStyleBackColor = True
        '
        'PhotoBox
        '
        Me.PhotoBox.Location = New System.Drawing.Point(12, 12)
        Me.PhotoBox.Name = "PhotoBox"
        Me.PhotoBox.Size = New System.Drawing.Size(217, 319)
        Me.PhotoBox.TabIndex = 12
        Me.PhotoBox.TabStop = False
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.FacultyIDLabel)
        Me.GroupBox2.Controls.Add(Me.FacultyNameLabel)
        Me.GroupBox2.Controls.Add(Me.EmailLabel)
        Me.GroupBox2.Controls.Add(Me.CollegeLabel)
        Me.GroupBox2.Controls.Add(Me.PhoneLabel)
        Me.GroupBox2.Controls.Add(Me.OfficeLabel)
        Me.GroupBox2.Controls.Add(Me.TitleLabel)
        Me.GroupBox2.Location = New System.Drawing.Point(275, 142)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(277, 209)
        Me.GroupBox2.TabIndex = 13
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Faculty Information"
        '
        'FacultyIDLabel
        '
        Me.FacultyIDLabel.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.FacultyBindingSource, "faculty_id", True))
        Me.FacultyIDLabel.Location = New System.Drawing.Point(16, 183)
        Me.FacultyIDLabel.Name = "FacultyIDLabel"
        Me.FacultyIDLabel.Size = New System.Drawing.Size(255, 20)
        Me.FacultyIDLabel.TabIndex = 6
        '
        'FacultyBindingSource
        '
        Me.FacultyBindingSource.DataMember = "Faculty"
        Me.FacultyBindingSource.DataSource = Me.CSE_DEPTDataSet
        '
        'CSE_DEPTDataSet
        '
        Me.CSE_DEPTDataSet.DataSetName = "CSE_DEPTDataSet"
        Me.CSE_DEPTDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'FacultyNameLabel
        '
        Me.FacultyNameLabel.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.FacultyBindingSource, "faculty_name", True))
        Me.FacultyNameLabel.Location = New System.Drawing.Point(16, 158)
        Me.FacultyNameLabel.Name = "FacultyNameLabel"
        Me.FacultyNameLabel.Size = New System.Drawing.Size(255, 20)
        Me.FacultyNameLabel.TabIndex = 5
        '
        'EmailLabel
        '
        Me.EmailLabel.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.FacultyBindingSource, "email", True))
        Me.EmailLabel.Location = New System.Drawing.Point(16, 132)
        Me.EmailLabel.Name = "EmailLabel"
        Me.EmailLabel.Size = New System.Drawing.Size(255, 20)
        Me.EmailLabel.TabIndex = 4
        '
        'CollegeLabel
        '
        Me.CollegeLabel.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.FacultyBindingSource, "college", True))
        Me.CollegeLabel.Location = New System.Drawing.Point(16, 106)
        Me.CollegeLabel.Name = "CollegeLabel"
        Me.CollegeLabel.Size = New System.Drawing.Size(255, 20)
        Me.CollegeLabel.TabIndex = 3
        '
        'PhoneLabel
        '
        Me.PhoneLabel.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.FacultyBindingSource, "phone", True))
        Me.PhoneLabel.Location = New System.Drawing.Point(16, 80)
        Me.PhoneLabel.Name = "PhoneLabel"
        Me.PhoneLabel.Size = New System.Drawing.Size(255, 20)
        Me.PhoneLabel.TabIndex = 2
        '
        'OfficeLabel
        '
        Me.OfficeLabel.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.FacultyBindingSource, "office", True))
        Me.OfficeLabel.Location = New System.Drawing.Point(16, 54)
        Me.OfficeLabel.Name = "OfficeLabel"
        Me.OfficeLabel.Size = New System.Drawing.Size(255, 20)
        Me.OfficeLabel.TabIndex = 1
        '
        'TitleLabel
        '
        Me.TitleLabel.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.FacultyBindingSource, "title", True))
        Me.TitleLabel.Location = New System.Drawing.Point(16, 28)
        Me.TitleLabel.Name = "TitleLabel"
        Me.TitleLabel.Size = New System.Drawing.Size(255, 20)
        Me.TitleLabel.TabIndex = 0
        '
        'FacultyTableAdapter
        '
        Me.FacultyTableAdapter.ClearBeforeFill = True
        '
        'FacultyForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(616, 440)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.PhotoBox)
        Me.Controls.Add(Me.CmdBack)
        Me.Controls.Add(Me.CmdDelete)
        Me.Controls.Add(Me.CmdUpdate)
        Me.Controls.Add(Me.CmdInsert)
        Me.Controls.Add(Me.CmdSelect)
        Me.Controls.Add(Me.GroupBox1)
        Me.Name = "FacultyForm"
        Me.Text = "FacultyForm"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        CType(Me.PhotoBox, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        CType(Me.FacultyBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.CSE_DEPTDataSet, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents ComboBoxFaculty As ComboBox
    Friend WithEvents Label1 As Label
    Friend WithEvents CmdSelect As Button
    Friend WithEvents CmdInsert As Button
    Friend WithEvents CmdUpdate As Button
    Friend WithEvents CmdDelete As Button
    Friend WithEvents CmdBack As Button
    Friend WithEvents PhotoBox As PictureBox
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents FacultyNameLabel As TextBox
    Friend WithEvents EmailLabel As TextBox
    Friend WithEvents CollegeLabel As TextBox
    Friend WithEvents PhoneLabel As TextBox
    Friend WithEvents OfficeLabel As TextBox
    Friend WithEvents TitleLabel As TextBox
    Friend WithEvents FacultyIDLabel As TextBox
    Friend WithEvents CSE_DEPTDataSet As CSE_DEPTDataSet
    Friend WithEvents FacultyBindingSource As BindingSource
    Friend WithEvents FacultyTableAdapter As CSE_DEPTDataSetTableAdapters.FacultyTableAdapter
End Class
