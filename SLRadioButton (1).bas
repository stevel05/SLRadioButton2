B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=4.7
@EndOfDesignText@
'Custom View class
#Event: SelectedChange(Selected As Boolean)
#Event: MouseClicked(EventData As MouseEvent)
#DesignerProperty: Key: Locate, DisplayName: Locate RadioButton, FieldType: String, DefaultValue: RIGHT, List: LEFT|RIGHT|TOP|BOTTOM
#DesignerProperty: Key: FixedWidth, DisplayName: Fixed Width, FieldType: String, DefaultValue: False, List: True|False
#DesignerProperty: Key: AutoGroup, DisplayName: Auto Group, FieldType: String, DefaultValue: True, List: True|False
#DesignerProperty: Key: Selected, DisplayName: Selected, FieldType: Boolean, DefaultValue: False

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mModule As Object 'ignore
	Private mBase As Pane
	Private RB As RadioButton
	Private RBJO As JavaObject
	Private Label1 As Label
	Private mForm As Form
	Public Const LOCATE_LEFT As String = "LEFT"
	Public Const LOCATE_RIGHT As String = "RIGHT"
	Public Const LOCATE_TOP As String = "TOP"
	Public Const LOCATE_BOTTOM As String = "BOTTOM"
	Private DesignerCVCalled As Boolean
	Private CustomViewName As String = "SLRadioButton" 'Set this to the name of your custom view to provide meaningfull error logging
	
End Sub

Public Sub Initialize (Module As Object, EventName As String)
	mEventName = EventName
	mModule = Module
End Sub



Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	'Check this is not called from setup
	If Not(Props.GetDefault("CVfromsetup",False)) Then DesignerCVCalled = True
	
	mBase = Base
	mBase.StyleClasses.Add("slradiobutton")
	Label1 = CloneLabel(Lbl,"Label1")
	
	Dim LblJO As JavaObject = Label1
	LblJO.RunMethod("setMinWidth",Array(-1.0))
	
	RB.Initialize("RB")
	RBJO = RB
	
	Dim FixedWidth As Boolean = Props.GetDefault("FixedWidth","False") = "True"
	If FixedWidth Then
		Label1.PrefHeight = Min(Label1.PrefHeight,RB.Height)
		Dim Locate As String = Props.Get("Locate")
		Select Locate
			Case LOCATE_LEFT
				Dim HBox As JavaObject
				HBox.InitializeNewInstance("javafx.scene.layout.HBox",Null)
				HBox.RunMethodJO("getChildren",Null).RunMethod("addAll",Array(Array(RB,Label1)))
				mBase.AddNode(HBox,0,0,mBase.Width,mBase.Height)
				HBox.RunMethod("setAlignment",Array("CENTER_LEFT"))
			Case LOCATE_RIGHT
				Dim HBox As JavaObject
				HBox.InitializeNewInstance("javafx.scene.layout.HBox",Null)
				HBox.RunMethodJO("getChildren",Null).RunMethod("addAll",Array(Array(Label1,RB)))
				mBase.AddNode(HBox,0,0,mBase.Width,mBase.Height)
				HBox.RunMethod("setAlignment",Array("CENTER_LEFT"))
			Case LOCATE_TOP,LOCATE_BOTTOM
				Dim LblJO As JavaObject = Label1
				LblJO.RunMethod("setGraphic",Array(RB))
				LblJO.RunMethod("setContentDisplay",Array(Props.Get("Locate")))
				mBase.AddNode(Label1,0,0,mBase.Width,mBase.Height)
		End Select
	Else
		Dim LblJO As JavaObject = Label1
		LblJO.RunMethod("setGraphic",Array(RB))
		LblJO.RunMethod("setContentDisplay",Array(Props.Get("Locate")))
		mBase.AddNode(Label1,0,0,mBase.Width,mBase.Height)
	End If
	
	Dim AutoGroup As Boolean = Props.GetDefault("AutoGroup","False") = "True"
	Log("AG " & AutoGroup)
	If AutoGroup Then FindToggleGroupAndAdd
	
	RB.Selected = Props.GetDefault("Selected",False)
	
End Sub

'Manual Setup of Custom View
'Pass the text for the Radiobutton, the location (Use a constant from this class
'Form - To add to a form or Null
'Pn to add to a pane or Null
'Desired location and size of the customview on the form or pane
Public Sub Setup(Text As String,Locate As String,FixedWidth As Boolean, AutoGroup As Boolean, Form As Form,Pn As Pane,Left As Int,Top As Int,Width As Int,Height As Int)
	'Check if DesignerCreateView has been called
	If DesignerCVCalled Then
		Log(CustomViewName & ": You should not call setup if you have defined this view in the designer")
		ExitApplication
	End If
	
	mForm = Form
	
	'Create our own base panel
	Dim Base As Pane
	Base.Initialize("Base")
	
	'If Null was passed, a Panel wii be created by casting, but it won't be initialized
	If Pn.IsInitialized Then
		Pn.AddNode(Base,Left,Top,Width,Height)
	Else
		mForm.RootPane.AddNode(Base,Left,Top,Width,Height)
	End If
		
	'Set up variables to pass to DesignerCreateView so we don't have to maintain two identical subs to create the custom view
	Dim M As Map
	M.Initialize
	M.Put("Locate",Locate)
	'As we are passing a map, we can use it to pass an additional flag for our own use 
	'with an ID unlikely To be used by B4a In the future
	M.Put("CVfromsetup",True)
	
	'Fixed Width
	Dim FW As String = "False"
	If FixedWidth Then FW = "True"
	M.Put("FixedWidth",FW)
	
	'AutoGroup
	Dim AG As String = "False"
	If AutoGroup Then AG = "True"
	M.Put("AutoGroup",AG)
	
	'Add any other properties that are required to match those added to the designer, they will also need to be added to the setup sub signature
	'or defaults created
	
		
	'We need a label to pass to DesignerCreateView
	Dim L As Label
	L.Initialize("")
	'Default text alignment
	L.Alignment = "CENTER"
	L.Text = Text
	'Default size for Custom View text in designer is 15
	L.Font = fx.DefaultFont(15)
	
	'Call designer create view
	DesignerCreateView(Base,L,M)
	
End Sub

'Clone a Label with the available properties
Private Sub CloneLabel(Lbl As Label,EventName As String) As Label
	Dim CLbl As Label
	CLbl.Initialize(EventName)
	CLbl.Alignment = Lbl.Alignment
	CLbl.Alpha = Lbl.Alpha
	If Lbl.ContextMenu.IsInitialized Then CLbl.ContextMenu = Lbl.ContextMenu
	CLbl.Enabled = Lbl.Enabled
	CLbl.Font = Lbl.Font
	CLbl.Id = Lbl.Id
	CLbl.Style = Lbl.Style
	CLbl.Tag = Lbl.Tag
	CLbl.Text = Lbl.Text
	CLbl.TextColor = Lbl.TextColor
	CLbl.TextSize = Lbl.TextSize
	If Lbl.TooltipText <> "" Then CLbl.TooltipText = Lbl.TooltipText
	CLbl.Visible = Lbl.Visible
	CLbl.WrapText = Lbl.WrapText
	Return CLbl	
End Sub

'
'#########################   Toggle group subs
'

'Add the Radiobutton to a toggle group, pass Null to Create a new ToggleGroup.
'Return ToggleGroup As JavaObject
Public Sub AddToToggleGroup(ToggleGroup As Object) As JavaObject
	Dim TG As JavaObject
	If ToggleGroup = Null Then
		 TG = NewToggleGroup
	Else
		TG = ToggleGroup
	End If
	TG.RunMethodJO("getToggles",Null).RunMethod("add",Array(RB))
	Return TG
End Sub

'Adds each Radoibutton in the array to a new togglegroup.  
'Returns the New Togglegroup as a JavaObject
Public Sub GroupRadioButtons(Buttons() As Object) As JavaObject
	Dim ToggleGroup As JavaObject = NewToggleGroup
	For Each Obj As Object In Buttons
		If Obj Is SLRadioButton Then 
			Dim SLRB As SLRadioButton = Obj
			SLRB.ToggleGroup = ToggleGroup 
		Else
			Dim RBtnJO As JavaObject = Obj
			RBtnJO.RunMethod("settogglegroup",Array(ToggleGroup))
		End If
	Next
	Return ToggleGroup
End Sub

Private Sub NewToggleGroup As JavaObject
	Dim ToggleGroup As JavaObject
	ToggleGroup.InitializeNewInstance("javafx.scene.control.ToggleGroup",Null)
	Return ToggleGroup
End Sub

'Get / Set the ToggleGroup that this Radiobutton belongs to
Public Sub getToggleGroup As JavaObject
	Return RBJO.RunMethod("getToggleGroup",Null)
End Sub

Public Sub setToggleGroup (ToggleGroup As Object)
	RBJO.RunMethod("setToggleGroup",Array(ToggleGroup))
End Sub

'Get the ToggleGroup that the passed RadioButton belongs to.
'Allows adding this button to a group of Radiobuttons that have been added with the designer.
'<code>SLRadioButton1.AddToToggleGroup(SLRadioButton1.GetToggleGroup2(RadioButton1))</code>
Public Sub GetToggleGroup2(RBtn As JavaObject) As JavaObject
	Return RBtn.RunMethod("getToggleGroup",Null)
End Sub

'Find the first RadioButton or Radiobutton in a Label in this SlRadiobuttons parent with a togglegroup if it has one, and assign the same group to this RB.
'Otherwise create a new toggle group
Private Sub FindToggleGroupAndAdd
	Dim Parent As Pane = mBase.Parent
	Dim RBtn As RadioButton
	Dim TG As JavaObject = Null
	For Each Child As Object In Parent.GetAllViewsRecursive
		If Child Is RadioButton Then
			RBtn = Child
			TG = AsJo(RBtn).RunMethod("getToggleGroup",Null)
			If TG.IsInitialized Then Exit
		End If
		If Child Is Label Then
			Dim O As Object = AsJo(Child).RunMethod("getGraphic",Null)
			If O Is RadioButton Then
				RBtn = O
				TG = AsJo(RBtn).RunMethod("getToggleGroup",Null)
				If TG.IsInitialized Then Exit
			End If
		End If
	Next
	
	If RBtn.IsInitialized And TG.IsInitialized Then
		AddToToggleGroup(TG)
	Else
		AddToToggleGroup(Null)
	End If
End Sub

'
'#########################   Event subs
'

Sub RB_MouseClicked (EventData As MouseEvent)
	If SubExists(mModule,mEventName & "_MouseClicked") Then CallSubDelayed2(mModule,mEventName & "_MouseClicked",EventData)
End Sub

'Change the radiobuttons selected value with a click on the label
Private Sub Label1_MouseClicked (EventData As MouseEvent)
	
	If RB.Enabled Then 
		RB.RequestFocus
		If RB.Selected = False Then RB.Selected = Not(RB.Selected)
	End If
	
	If SubExists(mModule,mEventName & "_MouseClicked") Then CallSubDelayed2(mModule,mEventName & "_MouseClicked",EventData)
End Sub

'Pass through the radiobutton's selected changed event
Private Sub RB_SelectedChange(Selected As Boolean)
	If SubExists(mModule,mEventName & "_SelectedChange") Then CallSubDelayed2(mModule,mEventName & "_SelectedChange",Selected)
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	Label1.PrefWidth = Width
	Label1.PrefHeight = Height
End Sub


'
'#########################   Radiobutton update subs
'

'Get / Set the Radiobuttons selected state
Public Sub getSelected As Boolean
	Return RB.Selected
End Sub
Public Sub setSelected(Selected As Boolean)
	RB.Selected = Selected
End Sub

'Get / Set the Radiobuttons enabled state
Public Sub getEnabled As Boolean
	Return RB.Enabled
End Sub
Public Sub setEnabled(Enabled As Boolean)
	RB.Enabled = Enabled
End Sub


'
'#########################   Get objects from this customview
'

'Returns the base pane of the CustomView.
'Use this to reposition the customview
Public Sub GetBase As Pane
	Return mBase
End Sub

'Returns the Radiobutton that this customview contains
Sub getRadioButton As RadioButton
	Return RB
End Sub

'Returns the label that this customview contains
'Use this to style the label
Sub getLabel As Label
	Return Label1
End Sub

Sub AsJo(JO As JavaObject) As JavaObject
	Return JO
End Sub