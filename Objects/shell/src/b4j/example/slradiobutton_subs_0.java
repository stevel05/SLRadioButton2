package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class slradiobutton_subs_0 {


public static RemoteObject  _addtotogglegroup(RemoteObject __ref,RemoteObject _togglegroup) throws Exception{
try {
		Debug.PushSubsStack("AddToToggleGroup (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("addtotogglegroup")) return __ref.runUserSub(false, "slradiobutton","addtotogglegroup", __ref, _togglegroup);
RemoteObject _tg = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ToggleGroup", _togglegroup);
 BA.debugLineNum = 174;BA.debugLine="Public Sub AddToToggleGroup(ToggleGroup As Object)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="Dim TG As JavaObject";
Debug.ShouldStop(16384);
_tg = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("TG", _tg);
 BA.debugLineNum = 176;BA.debugLine="If ToggleGroup = Null Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("n",_togglegroup)) { 
 BA.debugLineNum = 177;BA.debugLine="TG = NewToggleGroup";
Debug.ShouldStop(65536);
_tg = __ref.runClassMethod (b4j.example.slradiobutton.class, "_newtogglegroup");Debug.locals.put("TG", _tg);
 }else {
 BA.debugLineNum = 179;BA.debugLine="TG = ToggleGroup";
Debug.ShouldStop(262144);
_tg.setObject(_togglegroup);
 };
 BA.debugLineNum = 181;BA.debugLine="TG.RunMethodJO(\"getToggles\",Null).RunMethod(\"add\"";
Debug.ShouldStop(1048576);
_tg.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getToggles")),(Object)((slradiobutton.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("add")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_rb").getObject())})));
 BA.debugLineNum = 182;BA.debugLine="Return TG";
Debug.ShouldStop(2097152);
if (true) return _tg;
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asjo(RemoteObject __ref,RemoteObject _jo) throws Exception{
try {
		Debug.PushSubsStack("AsJo (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("asjo")) return __ref.runUserSub(false, "slradiobutton","asjo", __ref, _jo);
Debug.locals.put("JO", _jo);
 BA.debugLineNum = 322;BA.debugLine="Sub AsJo(JO As JavaObject) As JavaObject";
Debug.ShouldStop(2);
 BA.debugLineNum = 323;BA.debugLine="Return JO";
Debug.ShouldStop(4);
if (true) return _jo;
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("base_resize")) return __ref.runUserSub(false, "slradiobutton","base_resize", __ref, _width, _height);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 274;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Label1.PrefWidth = Width";
Debug.ShouldStop(262144);
__ref.getField(false,"_label1").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 276;BA.debugLine="Label1.PrefHeight = Height";
Debug.ShouldStop(524288);
__ref.getField(false,"_label1").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private fx As JFX";
slradiobutton._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",slradiobutton._fx);
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String 'ignore";
slradiobutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",slradiobutton._meventname);
 //BA.debugLineNum = 12;BA.debugLine="Private mModule As Object 'ignore";
slradiobutton._mmodule = RemoteObject.createNew ("Object");__ref.setField("_mmodule",slradiobutton._mmodule);
 //BA.debugLineNum = 13;BA.debugLine="Private mBase As Pane";
slradiobutton._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",slradiobutton._mbase);
 //BA.debugLineNum = 14;BA.debugLine="Private RB As RadioButton";
slradiobutton._rb = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper");__ref.setField("_rb",slradiobutton._rb);
 //BA.debugLineNum = 15;BA.debugLine="Private RBJO As JavaObject";
slradiobutton._rbjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_rbjo",slradiobutton._rbjo);
 //BA.debugLineNum = 16;BA.debugLine="Private Label1 As Label";
slradiobutton._label1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_label1",slradiobutton._label1);
 //BA.debugLineNum = 17;BA.debugLine="Private mForm As Form";
slradiobutton._mform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_mform",slradiobutton._mform);
 //BA.debugLineNum = 18;BA.debugLine="Public Const LOCATE_LEFT As String = \"LEFT\"";
slradiobutton._locate_left = BA.ObjectToString("LEFT");__ref.setField("_locate_left",slradiobutton._locate_left);
 //BA.debugLineNum = 19;BA.debugLine="Public Const LOCATE_RIGHT As String = \"RIGHT\"";
slradiobutton._locate_right = BA.ObjectToString("RIGHT");__ref.setField("_locate_right",slradiobutton._locate_right);
 //BA.debugLineNum = 20;BA.debugLine="Public Const LOCATE_TOP As String = \"TOP\"";
slradiobutton._locate_top = BA.ObjectToString("TOP");__ref.setField("_locate_top",slradiobutton._locate_top);
 //BA.debugLineNum = 21;BA.debugLine="Public Const LOCATE_BOTTOM As String = \"BOTTOM\"";
slradiobutton._locate_bottom = BA.ObjectToString("BOTTOM");__ref.setField("_locate_bottom",slradiobutton._locate_bottom);
 //BA.debugLineNum = 22;BA.debugLine="Private DesignerCVCalled As Boolean";
slradiobutton._designercvcalled = RemoteObject.createImmutable(false);__ref.setField("_designercvcalled",slradiobutton._designercvcalled);
 //BA.debugLineNum = 23;BA.debugLine="Private CustomViewName As String = \"SLRadioButton";
slradiobutton._customviewname = BA.ObjectToString("SLRadioButton");__ref.setField("_customviewname",slradiobutton._customviewname);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clonelabel(RemoteObject __ref,RemoteObject _lbl,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CloneLabel (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("clonelabel")) return __ref.runUserSub(false, "slradiobutton","clonelabel", __ref, _lbl, _eventname);
RemoteObject _clbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 148;BA.debugLine="Private Sub CloneLabel(Lbl As Label,EventName As S";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="Dim CLbl As Label";
Debug.ShouldStop(1048576);
_clbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("CLbl", _clbl);
 BA.debugLineNum = 150;BA.debugLine="CLbl.Initialize(EventName)";
Debug.ShouldStop(2097152);
_clbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 151;BA.debugLine="CLbl.Alignment = Lbl.Alignment";
Debug.ShouldStop(4194304);
_clbl.runMethod(true,"setAlignment",_lbl.runMethod(true,"getAlignment"));
 BA.debugLineNum = 152;BA.debugLine="CLbl.Alpha = Lbl.Alpha";
Debug.ShouldStop(8388608);
_clbl.runMethod(true,"setAlpha",_lbl.runMethod(true,"getAlpha"));
 BA.debugLineNum = 153;BA.debugLine="If Lbl.ContextMenu.IsInitialized Then CLbl.Contex";
Debug.ShouldStop(16777216);
if (_lbl.runMethod(false,"getContextMenu").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_clbl.runMethod(false,"setContextMenu",_lbl.runMethod(false,"getContextMenu"));};
 BA.debugLineNum = 154;BA.debugLine="CLbl.Enabled = Lbl.Enabled";
Debug.ShouldStop(33554432);
_clbl.runMethod(true,"setEnabled",_lbl.runMethod(true,"getEnabled"));
 BA.debugLineNum = 155;BA.debugLine="CLbl.Font = Lbl.Font";
Debug.ShouldStop(67108864);
_clbl.runMethod(false,"setFont",_lbl.runMethod(false,"getFont"));
 BA.debugLineNum = 156;BA.debugLine="CLbl.Id = Lbl.Id";
Debug.ShouldStop(134217728);
_clbl.runMethod(true,"setId",_lbl.runMethod(true,"getId"));
 BA.debugLineNum = 157;BA.debugLine="CLbl.Style = Lbl.Style";
Debug.ShouldStop(268435456);
_clbl.runMethod(true,"setStyle",_lbl.runMethod(true,"getStyle"));
 BA.debugLineNum = 158;BA.debugLine="CLbl.Tag = Lbl.Tag";
Debug.ShouldStop(536870912);
_clbl.runMethod(false,"setTag",_lbl.runMethod(false,"getTag"));
 BA.debugLineNum = 159;BA.debugLine="CLbl.Text = Lbl.Text";
Debug.ShouldStop(1073741824);
_clbl.runMethod(true,"setText",_lbl.runMethod(true,"getText"));
 BA.debugLineNum = 160;BA.debugLine="CLbl.TextColor = Lbl.TextColor";
Debug.ShouldStop(-2147483648);
_clbl.runMethod(false,"setTextColor",_lbl.runMethod(false,"getTextColor"));
 BA.debugLineNum = 161;BA.debugLine="CLbl.TextSize = Lbl.TextSize";
Debug.ShouldStop(1);
_clbl.runMethod(true,"setTextSize",_lbl.runMethod(true,"getTextSize"));
 BA.debugLineNum = 162;BA.debugLine="If Lbl.TooltipText <> \"\" Then CLbl.TooltipText =";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_lbl.runMethod(true,"getTooltipText"),BA.ObjectToString(""))) { 
_clbl.runMethod(true,"setTooltipText",_lbl.runMethod(true,"getTooltipText"));};
 BA.debugLineNum = 163;BA.debugLine="CLbl.Visible = Lbl.Visible";
Debug.ShouldStop(4);
_clbl.runMethod(true,"setVisible",_lbl.runMethod(true,"getVisible"));
 BA.debugLineNum = 164;BA.debugLine="CLbl.WrapText = Lbl.WrapText";
Debug.ShouldStop(8);
_clbl.runMethod(true,"setWrapText",_lbl.runMethod(true,"getWrapText"));
 BA.debugLineNum = 165;BA.debugLine="Return CLbl";
Debug.ShouldStop(16);
if (true) return _clbl;
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("designercreateview")) return __ref.runUserSub(false, "slradiobutton","designercreateview", __ref, _base, _lbl, _props);
RemoteObject _lbljo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _fixedwidth = RemoteObject.createImmutable(false);
RemoteObject _locate = RemoteObject.createImmutable("");
RemoteObject _hbox = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _autogroup = RemoteObject.createImmutable(false);
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 34;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="If Not(Props.GetDefault(\"CVfromsetup\",False)) The";
Debug.ShouldStop(8);
if (slradiobutton.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("CVfromsetup"))),(Object)((slradiobutton.__c.getField(true,"False"))))))).<Boolean>get().booleanValue()) { 
__ref.setField ("_designercvcalled",slradiobutton.__c.getField(true,"True"));};
 BA.debugLineNum = 38;BA.debugLine="mBase = Base";
Debug.ShouldStop(32);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 39;BA.debugLine="mBase.StyleClasses.Add(\"slradiobutton\")";
Debug.ShouldStop(64);
__ref.getField(false,"_mbase").runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("slradiobutton"))));
 BA.debugLineNum = 40;BA.debugLine="Label1 = CloneLabel(Lbl,\"Label1\")";
Debug.ShouldStop(128);
__ref.setField ("_label1",__ref.runClassMethod (b4j.example.slradiobutton.class, "_clonelabel",(Object)(_lbl),(Object)(RemoteObject.createImmutable("Label1"))));
 BA.debugLineNum = 42;BA.debugLine="Dim LblJO As JavaObject = Label1";
Debug.ShouldStop(512);
_lbljo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_lbljo.setObject(__ref.getField(false,"_label1").getObject());Debug.locals.put("LblJO", _lbljo);
 BA.debugLineNum = 43;BA.debugLine="LblJO.RunMethod(\"setMinWidth\",Array(-1.0))";
Debug.ShouldStop(1024);
_lbljo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMinWidth")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((-1.0))})));
 BA.debugLineNum = 45;BA.debugLine="RB.Initialize(\"RB\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_rb").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("RB")));
 BA.debugLineNum = 46;BA.debugLine="RBJO = RB";
Debug.ShouldStop(8192);
__ref.getField(false,"_rbjo").setObject (__ref.getField(false,"_rb").getObject());
 BA.debugLineNum = 48;BA.debugLine="Dim FixedWidth As Boolean = Props.GetDefault(\"Fix";
Debug.ShouldStop(32768);
_fixedwidth = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FixedWidth"))),(Object)((RemoteObject.createImmutable("False")))),RemoteObject.createImmutable(("True"))));Debug.locals.put("FixedWidth", _fixedwidth);Debug.locals.put("FixedWidth", _fixedwidth);
 BA.debugLineNum = 49;BA.debugLine="If FixedWidth Then";
Debug.ShouldStop(65536);
if (_fixedwidth.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 50;BA.debugLine="Label1.PrefHeight = Min(Label1.PrefHeight,RB.Hei";
Debug.ShouldStop(131072);
__ref.getField(false,"_label1").runMethod(true,"setPrefHeight",slradiobutton.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_label1").runMethod(true,"getPrefHeight")),(Object)(__ref.getField(false,"_rb").runMethod(true,"getHeight"))));
 BA.debugLineNum = 51;BA.debugLine="Dim Locate As String = Props.Get(\"Locate\")";
Debug.ShouldStop(262144);
_locate = BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Locate")))));Debug.locals.put("Locate", _locate);Debug.locals.put("Locate", _locate);
 BA.debugLineNum = 52;BA.debugLine="Select Locate";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(_locate,__ref.getField(true,"_locate_left"),__ref.getField(true,"_locate_right"),__ref.getField(true,"_locate_top"),__ref.getField(true,"_locate_bottom"))) {
case 0: {
 BA.debugLineNum = 54;BA.debugLine="Dim HBox As JavaObject";
Debug.ShouldStop(2097152);
_hbox = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("HBox", _hbox);
 BA.debugLineNum = 55;BA.debugLine="HBox.InitializeNewInstance(\"javafx.scene.layou";
Debug.ShouldStop(4194304);
_hbox.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.layout.HBox")),(Object)((slradiobutton.__c.getField(false,"Null"))));
 BA.debugLineNum = 56;BA.debugLine="HBox.RunMethodJO(\"getChildren\",Null).RunMethod";
Debug.ShouldStop(8388608);
_hbox.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getChildren")),(Object)((slradiobutton.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addAll")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(false,"_rb").getObject()),(__ref.getField(false,"_label1").getObject())}))})));
 BA.debugLineNum = 57;BA.debugLine="mBase.AddNode(HBox,0,0,mBase.Width,mBase.Heigh";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbase").runVoidMethod ("AddNode",(Object)((_hbox.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getHeight")));
 BA.debugLineNum = 58;BA.debugLine="HBox.RunMethod(\"setAlignment\",Array(\"CENTER_LE";
Debug.ShouldStop(33554432);
_hbox.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("CENTER_LEFT"))})));
 break; }
case 1: {
 BA.debugLineNum = 60;BA.debugLine="Dim HBox As JavaObject";
Debug.ShouldStop(134217728);
_hbox = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("HBox", _hbox);
 BA.debugLineNum = 61;BA.debugLine="HBox.InitializeNewInstance(\"javafx.scene.layou";
Debug.ShouldStop(268435456);
_hbox.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.layout.HBox")),(Object)((slradiobutton.__c.getField(false,"Null"))));
 BA.debugLineNum = 62;BA.debugLine="HBox.RunMethodJO(\"getChildren\",Null).RunMethod";
Debug.ShouldStop(536870912);
_hbox.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getChildren")),(Object)((slradiobutton.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addAll")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(false,"_label1").getObject()),(__ref.getField(false,"_rb").getObject())}))})));
 BA.debugLineNum = 63;BA.debugLine="mBase.AddNode(HBox,0,0,mBase.Width,mBase.Heigh";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase").runVoidMethod ("AddNode",(Object)((_hbox.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getHeight")));
 BA.debugLineNum = 64;BA.debugLine="HBox.RunMethod(\"setAlignment\",Array(\"CENTER_LE";
Debug.ShouldStop(-2147483648);
_hbox.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("CENTER_LEFT"))})));
 break; }
case 2: 
case 3: {
 BA.debugLineNum = 66;BA.debugLine="Dim LblJO As JavaObject = Label1";
Debug.ShouldStop(2);
_lbljo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_lbljo.setObject(__ref.getField(false,"_label1").getObject());Debug.locals.put("LblJO", _lbljo);
 BA.debugLineNum = 67;BA.debugLine="LblJO.RunMethod(\"setGraphic\",Array(RB))";
Debug.ShouldStop(4);
_lbljo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setGraphic")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_rb").getObject())})));
 BA.debugLineNum = 68;BA.debugLine="LblJO.RunMethod(\"setContentDisplay\",Array(Prop";
Debug.ShouldStop(8);
_lbljo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setContentDisplay")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Locate"))))})));
 BA.debugLineNum = 69;BA.debugLine="mBase.AddNode(Label1,0,0,mBase.Width,mBase.Hei";
Debug.ShouldStop(16);
__ref.getField(false,"_mbase").runVoidMethod ("AddNode",(Object)((__ref.getField(false,"_label1").getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getHeight")));
 break; }
}
;
 }else {
 BA.debugLineNum = 72;BA.debugLine="Dim LblJO As JavaObject = Label1";
Debug.ShouldStop(128);
_lbljo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_lbljo.setObject(__ref.getField(false,"_label1").getObject());Debug.locals.put("LblJO", _lbljo);
 BA.debugLineNum = 73;BA.debugLine="LblJO.RunMethod(\"setGraphic\",Array(RB))";
Debug.ShouldStop(256);
_lbljo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setGraphic")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_rb").getObject())})));
 BA.debugLineNum = 74;BA.debugLine="LblJO.RunMethod(\"setContentDisplay\",Array(Props.";
Debug.ShouldStop(512);
_lbljo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setContentDisplay")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Locate"))))})));
 BA.debugLineNum = 75;BA.debugLine="mBase.AddNode(Label1,0,0,mBase.Width,mBase.Heigh";
Debug.ShouldStop(1024);
__ref.getField(false,"_mbase").runVoidMethod ("AddNode",(Object)((__ref.getField(false,"_label1").getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 78;BA.debugLine="Dim AutoGroup As Boolean = Props.GetDefault(\"Auto";
Debug.ShouldStop(8192);
_autogroup = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AutoGroup"))),(Object)((RemoteObject.createImmutable("False")))),RemoteObject.createImmutable(("True"))));Debug.locals.put("AutoGroup", _autogroup);Debug.locals.put("AutoGroup", _autogroup);
 BA.debugLineNum = 79;BA.debugLine="Log(\"AG \" & AutoGroup)";
Debug.ShouldStop(16384);
slradiobutton.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("AG "),_autogroup)));
 BA.debugLineNum = 80;BA.debugLine="If AutoGroup Then FindToggleGroupAndAdd";
Debug.ShouldStop(32768);
if (_autogroup.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.slradiobutton.class, "_findtogglegroupandadd");};
 BA.debugLineNum = 82;BA.debugLine="RB.Selected = Props.GetDefault(\"Selected\",False)";
Debug.ShouldStop(131072);
__ref.getField(false,"_rb").runMethod(true,"setSelected",BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Selected"))),(Object)((slradiobutton.__c.getField(true,"False"))))));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findtogglegroupandadd(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FindToggleGroupAndAdd (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("findtogglegroupandadd")) return __ref.runUserSub(false, "slradiobutton","findtogglegroupandadd", __ref);
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _rbtn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper");
RemoteObject _tg = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _child = RemoteObject.declareNull("Object");
RemoteObject _o = RemoteObject.declareNull("Object");
 BA.debugLineNum = 225;BA.debugLine="Private Sub FindToggleGroupAndAdd";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="Dim Parent As Pane = mBase.Parent";
Debug.ShouldStop(2);
_parent = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_parent.setObject(__ref.getField(false,"_mbase").runMethod(false,"getParent").getObject());Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 227;BA.debugLine="Dim RBtn As RadioButton";
Debug.ShouldStop(4);
_rbtn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper");Debug.locals.put("RBtn", _rbtn);
 BA.debugLineNum = 228;BA.debugLine="Dim TG As JavaObject = Null";
Debug.ShouldStop(8);
_tg = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_tg.setObject(slradiobutton.__c.getField(false,"Null"));Debug.locals.put("TG", _tg);
 BA.debugLineNum = 229;BA.debugLine="For Each Child As Object In Parent.GetAllViewsRec";
Debug.ShouldStop(16);
final RemoteObject group4 = _parent.runMethod(false,"GetAllViewsRecursive");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get();
for (int index4 = 0;index4 < groupLen4 ;index4++){
_child = group4.runMethod(false,"Get",index4);Debug.locals.put("Child", _child);
Debug.locals.put("Child", _child);
 BA.debugLineNum = 230;BA.debugLine="If Child Is RadioButton Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("i",_child, RemoteObject.createImmutable("javafx.scene.control.RadioButton"))) { 
 BA.debugLineNum = 231;BA.debugLine="RBtn = Child";
Debug.ShouldStop(64);
_rbtn.setObject(_child);
 BA.debugLineNum = 232;BA.debugLine="TG = AsJo(RBtn).RunMethod(\"getToggleGroup\",Null";
Debug.ShouldStop(128);
_tg.setObject(__ref.runClassMethod (b4j.example.slradiobutton.class, "_asjo",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _rbtn.getObject())).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getToggleGroup")),(Object)((slradiobutton.__c.getField(false,"Null")))));
 BA.debugLineNum = 233;BA.debugLine="If TG.IsInitialized Then Exit";
Debug.ShouldStop(256);
if (_tg.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
if (true) break;};
 };
 BA.debugLineNum = 235;BA.debugLine="If Child Is Label Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("i",_child, RemoteObject.createImmutable("javafx.scene.control.Label"))) { 
 BA.debugLineNum = 236;BA.debugLine="Dim O As Object = AsJo(Child).RunMethod(\"getGra";
Debug.ShouldStop(2048);
_o = __ref.runClassMethod (b4j.example.slradiobutton.class, "_asjo",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _child)).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getGraphic")),(Object)((slradiobutton.__c.getField(false,"Null"))));Debug.locals.put("O", _o);Debug.locals.put("O", _o);
 BA.debugLineNum = 237;BA.debugLine="If O Is RadioButton Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("i",_o, RemoteObject.createImmutable("javafx.scene.control.RadioButton"))) { 
 BA.debugLineNum = 238;BA.debugLine="RBtn = O";
Debug.ShouldStop(8192);
_rbtn.setObject(_o);
 BA.debugLineNum = 239;BA.debugLine="TG = AsJo(RBtn).RunMethod(\"getToggleGroup\",Nul";
Debug.ShouldStop(16384);
_tg.setObject(__ref.runClassMethod (b4j.example.slradiobutton.class, "_asjo",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _rbtn.getObject())).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getToggleGroup")),(Object)((slradiobutton.__c.getField(false,"Null")))));
 BA.debugLineNum = 240;BA.debugLine="If TG.IsInitialized Then Exit";
Debug.ShouldStop(32768);
if (_tg.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
if (true) break;};
 };
 };
 }
Debug.locals.put("Child", _child);
;
 BA.debugLineNum = 245;BA.debugLine="If RBtn.IsInitialized And TG.IsInitialized Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(".",_rbtn.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",_tg.runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 246;BA.debugLine="AddToToggleGroup(TG)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.slradiobutton.class, "_addtotogglegroup",(Object)((_tg.getObject())));
 }else {
 BA.debugLineNum = 248;BA.debugLine="AddToToggleGroup(Null)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.slradiobutton.class, "_addtotogglegroup",(Object)(slradiobutton.__c.getField(false,"Null")));
 };
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("getbase")) return __ref.runUserSub(false, "slradiobutton","getbase", __ref);
 BA.debugLineNum = 307;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(262144);
 BA.debugLineNum = 308;BA.debugLine="Return mBase";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEnabled (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("getenabled")) return __ref.runUserSub(false, "slradiobutton","getenabled", __ref);
 BA.debugLineNum = 293;BA.debugLine="Public Sub getEnabled As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 294;BA.debugLine="Return RB.Enabled";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_rb").runMethod(true,"getEnabled");
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlabel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLabel (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("getlabel")) return __ref.runUserSub(false, "slradiobutton","getlabel", __ref);
 BA.debugLineNum = 318;BA.debugLine="Sub getLabel As Label";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="Return Label1";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(false,"_label1");
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getradiobutton(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRadioButton (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("getradiobutton")) return __ref.runUserSub(false, "slradiobutton","getradiobutton", __ref);
 BA.debugLineNum = 312;BA.debugLine="Sub getRadioButton As RadioButton";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 313;BA.debugLine="Return RB";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(false,"_rb");
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelected (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,285);
if (RapidSub.canDelegate("getselected")) return __ref.runUserSub(false, "slradiobutton","getselected", __ref);
 BA.debugLineNum = 285;BA.debugLine="Public Sub getSelected As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 286;BA.debugLine="Return RB.Selected";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(false,"_rb").runMethod(true,"getSelected");
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettogglegroup(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getToggleGroup (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("gettogglegroup")) return __ref.runUserSub(false, "slradiobutton","gettogglegroup", __ref);
 BA.debugLineNum = 208;BA.debugLine="Public Sub getToggleGroup As JavaObject";
Debug.ShouldStop(32768);
 BA.debugLineNum = 209;BA.debugLine="Return RBJO.RunMethod(\"getToggleGroup\",Null)";
Debug.ShouldStop(65536);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_rbjo").runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getToggleGroup")),(Object)((slradiobutton.__c.getField(false,"Null")))));
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettogglegroup2(RemoteObject __ref,RemoteObject _rbtn) throws Exception{
try {
		Debug.PushSubsStack("GetToggleGroup2 (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,219);
if (RapidSub.canDelegate("gettogglegroup2")) return __ref.runUserSub(false, "slradiobutton","gettogglegroup2", __ref, _rbtn);
Debug.locals.put("RBtn", _rbtn);
 BA.debugLineNum = 219;BA.debugLine="Public Sub GetToggleGroup2(RBtn As JavaObject) As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 220;BA.debugLine="Return RBtn.RunMethod(\"getToggleGroup\",Null)";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _rbtn.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getToggleGroup")),(Object)((slradiobutton.__c.getField(false,"Null")))));
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _groupradiobuttons(RemoteObject __ref,RemoteObject _buttons) throws Exception{
try {
		Debug.PushSubsStack("GroupRadioButtons (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("groupradiobuttons")) return __ref.runUserSub(false, "slradiobutton","groupradiobuttons", __ref, _buttons);
RemoteObject _togglegroup = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _obj = RemoteObject.declareNull("Object");
RemoteObject _slrb = RemoteObject.declareNull("b4j.example.slradiobutton");
RemoteObject _rbtnjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Buttons", _buttons);
 BA.debugLineNum = 187;BA.debugLine="Public Sub GroupRadioButtons(Buttons() As Object)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="Dim ToggleGroup As JavaObject = NewToggleGroup";
Debug.ShouldStop(134217728);
_togglegroup = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_togglegroup = __ref.runClassMethod (b4j.example.slradiobutton.class, "_newtogglegroup");Debug.locals.put("ToggleGroup", _togglegroup);Debug.locals.put("ToggleGroup", _togglegroup);
 BA.debugLineNum = 189;BA.debugLine="For Each Obj As Object In Buttons";
Debug.ShouldStop(268435456);
final RemoteObject group2 = _buttons;
final int groupLen2 = group2.getField(true,"length").<Integer>get();
for (int index2 = 0;index2 < groupLen2 ;index2++){
_obj = group2.getArrayElement(false,RemoteObject.createImmutable(index2));Debug.locals.put("Obj", _obj);
Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 190;BA.debugLine="If Obj Is SLRadioButton Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("i",_obj, RemoteObject.createImmutable("b4j.example.slradiobutton"))) { 
 BA.debugLineNum = 191;BA.debugLine="Dim SLRB As SLRadioButton = Obj";
Debug.ShouldStop(1073741824);
_slrb = (_obj);Debug.locals.put("SLRB", _slrb);Debug.locals.put("SLRB", _slrb);
 BA.debugLineNum = 192;BA.debugLine="SLRB.ToggleGroup = ToggleGroup";
Debug.ShouldStop(-2147483648);
_slrb.runClassMethod (b4j.example.slradiobutton.class, "_settogglegroup",(_togglegroup.getObject()));
 }else {
 BA.debugLineNum = 194;BA.debugLine="Dim RBtnJO As JavaObject = Obj";
Debug.ShouldStop(2);
_rbtnjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_rbtnjo.setObject(_obj);Debug.locals.put("RBtnJO", _rbtnjo);
 BA.debugLineNum = 195;BA.debugLine="RBtnJO.RunMethod(\"settogglegroup\",Array(ToggleG";
Debug.ShouldStop(4);
_rbtnjo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("settogglegroup")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_togglegroup.getObject())})));
 };
 }
Debug.locals.put("Obj", _obj);
;
 BA.debugLineNum = 198;BA.debugLine="Return ToggleGroup";
Debug.ShouldStop(32);
if (true) return _togglegroup;
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _module,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "slradiobutton","initialize", __ref, _ba, _module, _eventname);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Module", _module);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (Module As Object, EventName";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(134217728);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 29;BA.debugLine="mModule = Module";
Debug.ShouldStop(268435456);
__ref.setField ("_mmodule",_module);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label1_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Label1_MouseClicked (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("label1_mouseclicked")) return __ref.runUserSub(false, "slradiobutton","label1_mouseclicked", __ref, _eventdata);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 261;BA.debugLine="Private Sub Label1_MouseClicked (EventData As Mous";
Debug.ShouldStop(16);
 BA.debugLineNum = 263;BA.debugLine="If RB.Enabled Then";
Debug.ShouldStop(64);
if (__ref.getField(false,"_rb").runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 264;BA.debugLine="RB.RequestFocus";
Debug.ShouldStop(128);
__ref.getField(false,"_rb").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 265;BA.debugLine="If RB.Selected = False Then RB.Selected = Not(RB";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_rb").runMethod(true,"getSelected"),slradiobutton.__c.getField(true,"False"))) { 
__ref.getField(false,"_rb").runMethod(true,"setSelected",slradiobutton.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_rb").runMethod(true,"getSelected"))));};
 };
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newtogglegroup(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NewToggleGroup (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("newtogglegroup")) return __ref.runUserSub(false, "slradiobutton","newtogglegroup", __ref);
RemoteObject _togglegroup = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 201;BA.debugLine="Private Sub NewToggleGroup As JavaObject";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="Dim ToggleGroup As JavaObject";
Debug.ShouldStop(512);
_togglegroup = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ToggleGroup", _togglegroup);
 BA.debugLineNum = 203;BA.debugLine="ToggleGroup.InitializeNewInstance(\"javafx.scene.c";
Debug.ShouldStop(1024);
_togglegroup.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.ToggleGroup")),(Object)((slradiobutton.__c.getField(false,"Null"))));
 BA.debugLineNum = 204;BA.debugLine="Return ToggleGroup";
Debug.ShouldStop(2048);
if (true) return _togglegroup;
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rb_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("RB_MouseClicked (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("rb_mouseclicked")) return __ref.runUserSub(false, "slradiobutton","rb_mouseclicked", __ref, _eventdata);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 256;BA.debugLine="Sub RB_MouseClicked (EventData As MouseEvent)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="If SubExists(mModule,mEventName & \"_MouseClicked\"";
Debug.ShouldStop(1);
if (slradiobutton.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseClicked")))).<Boolean>get().booleanValue()) { 
slradiobutton.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseClicked"))),(Object)((_eventdata)));};
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rb_selectedchange(RemoteObject __ref,RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("RB_SelectedChange (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("rb_selectedchange")) return __ref.runUserSub(false, "slradiobutton","rb_selectedchange", __ref, _selected);
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 270;BA.debugLine="Private Sub RB_SelectedChange(Selected As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 271;BA.debugLine="If SubExists(mModule,mEventName & \"_SelectedChang";
Debug.ShouldStop(16384);
if (slradiobutton.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_SelectedChange")))).<Boolean>get().booleanValue()) { 
slradiobutton.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_SelectedChange"))),(Object)((_selected)));};
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setenabled(RemoteObject __ref,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("setEnabled (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,296);
if (RapidSub.canDelegate("setenabled")) return __ref.runUserSub(false, "slradiobutton","setenabled", __ref, _enabled);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 296;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 297;BA.debugLine="RB.Enabled = Enabled";
Debug.ShouldStop(256);
__ref.getField(false,"_rb").runMethod(true,"setEnabled",_enabled);
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselected(RemoteObject __ref,RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("setSelected (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("setselected")) return __ref.runUserSub(false, "slradiobutton","setselected", __ref, _selected);
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 288;BA.debugLine="Public Sub setSelected(Selected As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="RB.Selected = Selected";
Debug.ShouldStop(1);
__ref.getField(false,"_rb").runMethod(true,"setSelected",_selected);
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settogglegroup(RemoteObject __ref,RemoteObject _togglegroup) throws Exception{
try {
		Debug.PushSubsStack("setToggleGroup (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("settogglegroup")) return __ref.runUserSub(false, "slradiobutton","settogglegroup", __ref, _togglegroup);
Debug.locals.put("ToggleGroup", _togglegroup);
 BA.debugLineNum = 212;BA.debugLine="Public Sub setToggleGroup (ToggleGroup As Object)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="RBJO.RunMethod(\"setToggleGroup\",Array(ToggleGroup";
Debug.ShouldStop(1048576);
__ref.getField(false,"_rbjo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setToggleGroup")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_togglegroup})));
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setup(RemoteObject __ref,RemoteObject _text,RemoteObject _locate,RemoteObject _fixedwidth,RemoteObject _autogroup,RemoteObject _form,RemoteObject _pn,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Setup (slradiobutton) ","slradiobutton",1,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setup")) return __ref.runUserSub(false, "slradiobutton","setup", __ref, _text, _locate, _fixedwidth, _autogroup, _form, _pn, _left, _top, _width, _height);
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fw = RemoteObject.createImmutable("");
RemoteObject _ag = RemoteObject.createImmutable("");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("Locate", _locate);
Debug.locals.put("FixedWidth", _fixedwidth);
Debug.locals.put("AutoGroup", _autogroup);
Debug.locals.put("Form", _form);
Debug.locals.put("Pn", _pn);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 91;BA.debugLine="Public Sub Setup(Text As String,Locate As String,F";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 93;BA.debugLine="If DesignerCVCalled Then";
Debug.ShouldStop(268435456);
if (__ref.getField(true,"_designercvcalled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 94;BA.debugLine="Log(CustomViewName & \": You should not call setu";
Debug.ShouldStop(536870912);
slradiobutton.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(__ref.getField(true,"_customviewname"),RemoteObject.createImmutable(": You should not call setup if you have defined this view in the designer"))));
 BA.debugLineNum = 95;BA.debugLine="ExitApplication";
Debug.ShouldStop(1073741824);
slradiobutton.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 98;BA.debugLine="mForm = Form";
Debug.ShouldStop(2);
__ref.setField ("_mform",_form);
 BA.debugLineNum = 101;BA.debugLine="Dim Base As Pane";
Debug.ShouldStop(16);
_base = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 102;BA.debugLine="Base.Initialize(\"Base\")";
Debug.ShouldStop(32);
_base.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Base")));
 BA.debugLineNum = 105;BA.debugLine="If Pn.IsInitialized Then";
Debug.ShouldStop(256);
if (_pn.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 106;BA.debugLine="Pn.AddNode(Base,Left,Top,Width,Height)";
Debug.ShouldStop(512);
_pn.runVoidMethod ("AddNode",(Object)((_base.getObject())),(Object)(BA.numberCast(double.class, _left)),(Object)(BA.numberCast(double.class, _top)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 }else {
 BA.debugLineNum = 108;BA.debugLine="mForm.RootPane.AddNode(Base,Left,Top,Width,Heigh";
Debug.ShouldStop(2048);
__ref.getField(false,"_mform").runMethod(false,"getRootPane").runVoidMethod ("AddNode",(Object)((_base.getObject())),(Object)(BA.numberCast(double.class, _left)),(Object)(BA.numberCast(double.class, _top)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 };
 BA.debugLineNum = 112;BA.debugLine="Dim M As Map";
Debug.ShouldStop(32768);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("M", _m);
 BA.debugLineNum = 113;BA.debugLine="M.Initialize";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 114;BA.debugLine="M.Put(\"Locate\",Locate)";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Locate"))),(Object)((_locate)));
 BA.debugLineNum = 117;BA.debugLine="M.Put(\"CVfromsetup\",True)";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CVfromsetup"))),(Object)((slradiobutton.__c.getField(true,"True"))));
 BA.debugLineNum = 120;BA.debugLine="Dim FW As String = \"False\"";
Debug.ShouldStop(8388608);
_fw = BA.ObjectToString("False");Debug.locals.put("FW", _fw);Debug.locals.put("FW", _fw);
 BA.debugLineNum = 121;BA.debugLine="If FixedWidth Then FW = \"True\"";
Debug.ShouldStop(16777216);
if (_fixedwidth.<Boolean>get().booleanValue()) { 
_fw = BA.ObjectToString("True");Debug.locals.put("FW", _fw);};
 BA.debugLineNum = 122;BA.debugLine="M.Put(\"FixedWidth\",FW)";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FixedWidth"))),(Object)((_fw)));
 BA.debugLineNum = 125;BA.debugLine="Dim AG As String = \"False\"";
Debug.ShouldStop(268435456);
_ag = BA.ObjectToString("False");Debug.locals.put("AG", _ag);Debug.locals.put("AG", _ag);
 BA.debugLineNum = 126;BA.debugLine="If AutoGroup Then AG = \"True\"";
Debug.ShouldStop(536870912);
if (_autogroup.<Boolean>get().booleanValue()) { 
_ag = BA.ObjectToString("True");Debug.locals.put("AG", _ag);};
 BA.debugLineNum = 127;BA.debugLine="M.Put(\"AutoGroup\",AG)";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AutoGroup"))),(Object)((_ag)));
 BA.debugLineNum = 134;BA.debugLine="Dim L As Label";
Debug.ShouldStop(32);
_l = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 135;BA.debugLine="L.Initialize(\"\")";
Debug.ShouldStop(64);
_l.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 137;BA.debugLine="L.Alignment = \"CENTER\"";
Debug.ShouldStop(256);
_l.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 138;BA.debugLine="L.Text = Text";
Debug.ShouldStop(512);
_l.runMethod(true,"setText",_text);
 BA.debugLineNum = 140;BA.debugLine="L.Font = fx.DefaultFont(15)";
Debug.ShouldStop(2048);
_l.runMethod(false,"setFont",__ref.getField(false,"_fx").runMethod(false,"DefaultFont",(Object)(BA.numberCast(double.class, 15))));
 BA.debugLineNum = 143;BA.debugLine="DesignerCreateView(Base,L,M)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.slradiobutton.class, "_designercreateview",(Object)(_base),(Object)(_l),(Object)(_m));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}