package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class slradiobutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.slradiobutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.slradiobutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mmodule = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper _rb = null;
public anywheresoftware.b4j.object.JavaObject _rbjo = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.Form _mform = null;
public String _locate_left = "";
public String _locate_right = "";
public String _locate_top = "";
public String _locate_bottom = "";
public boolean _designercvcalled = false;
public String _customviewname = "";
public b4j.example.main _main = null;
public b4j.example.slradiobutton_static _slradiobutton_static = null;
public anywheresoftware.b4j.object.JavaObject  _groupradiobuttons(b4j.example.slradiobutton __ref,Object[] _buttons) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "groupradiobuttons"))
	return (anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "groupradiobuttons", new Object[] {_buttons});
anywheresoftware.b4j.object.JavaObject _togglegroup = null;
Object _obj = null;
b4j.example.slradiobutton _slrb = null;
anywheresoftware.b4j.object.JavaObject _rbtnjo = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub GroupRadioButtons(Buttons() As Object)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim ToggleGroup As JavaObject = NewToggleGroup";
_togglegroup = new anywheresoftware.b4j.object.JavaObject();
_togglegroup = __ref._newtogglegroup(null);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="For Each Obj As Object In Buttons";
final Object[] group2 = _buttons;
final int groupLen2 = group2.length;
for (int index2 = 0;index2 < groupLen2 ;index2++){
_obj = group2[index2];
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="If Obj Is SLRadioButton Then";
if (_obj instanceof b4j.example.slradiobutton) { 
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Dim SLRB As SLRadioButton = Obj";
_slrb = (b4j.example.slradiobutton)(_obj);
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="SLRB.ToggleGroup = ToggleGroup";
_slrb._settogglegroup(null,(Object)(_togglegroup.getObject()));
 }else {
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="Dim RBtnJO As JavaObject = Obj";
_rbtnjo = new anywheresoftware.b4j.object.JavaObject();
_rbtnjo.setObject((java.lang.Object)(_obj));
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="RBtnJO.RunMethod(\"settogglegroup\",Array(ToggleG";
_rbtnjo.RunMethod("settogglegroup",new Object[]{(Object)(_togglegroup.getObject())});
 };
 }
;
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="Return ToggleGroup";
if (true) return _togglegroup;
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.slradiobutton __ref,anywheresoftware.b4a.BA _ba,Object _module,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_module,_eventname});
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub Initialize (Module As Object, EventName";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="mModule = Module";
__ref._mmodule = _module;
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="End Sub";
return "";
}
public String  _setup(b4j.example.slradiobutton __ref,String _text,String _locate,boolean _fixedwidth,boolean _autogroup,anywheresoftware.b4j.objects.Form _form,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "setup"))
	return (String) Debug.delegate(ba, "setup", new Object[] {_text,_locate,_fixedwidth,_autogroup,_form,_pn,_left,_top,_width,_height});
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _fw = "";
String _ag = "";
anywheresoftware.b4j.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Setup(Text As String,Locate As String,F";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="If DesignerCVCalled Then";
if (__ref._designercvcalled) { 
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Log(CustomViewName & \": You should not call setu";
__c.Log(__ref._customviewname+": You should not call setup if you have defined this view in the designer");
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="ExitApplication";
__c.ExitApplication();
 };
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="mForm = Form";
__ref._mform = _form;
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Dim Base As Pane";
_base = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Base.Initialize(\"Base\")";
_base.Initialize(ba,"Base");
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="If Pn.IsInitialized Then";
if (_pn.IsInitialized()) { 
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="Pn.AddNode(Base,Left,Top,Width,Height)";
_pn.AddNode((javafx.scene.Node)(_base.getObject()),_left,_top,_width,_height);
 }else {
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="mForm.RootPane.AddNode(Base,Left,Top,Width,Heigh";
__ref._mform.getRootPane().AddNode((javafx.scene.Node)(_base.getObject()),_left,_top,_width,_height);
 };
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="M.Initialize";
_m.Initialize();
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="M.Put(\"Locate\",Locate)";
_m.Put((Object)("Locate"),(Object)(_locate));
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="M.Put(\"CVfromsetup\",True)";
_m.Put((Object)("CVfromsetup"),(Object)(__c.True));
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="Dim FW As String = \"False\"";
_fw = "False";
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="If FixedWidth Then FW = \"True\"";
if (_fixedwidth) { 
_fw = "True";};
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="M.Put(\"FixedWidth\",FW)";
_m.Put((Object)("FixedWidth"),(Object)(_fw));
RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="Dim AG As String = \"False\"";
_ag = "False";
RDebugUtils.currentLine=589859;
 //BA.debugLineNum = 589859;BA.debugLine="If AutoGroup Then AG = \"True\"";
if (_autogroup) { 
_ag = "True";};
RDebugUtils.currentLine=589860;
 //BA.debugLineNum = 589860;BA.debugLine="M.Put(\"AutoGroup\",AG)";
_m.Put((Object)("AutoGroup"),(Object)(_ag));
RDebugUtils.currentLine=589867;
 //BA.debugLineNum = 589867;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=589868;
 //BA.debugLineNum = 589868;BA.debugLine="L.Initialize(\"\")";
_l.Initialize(ba,"");
RDebugUtils.currentLine=589870;
 //BA.debugLineNum = 589870;BA.debugLine="L.Alignment = \"CENTER\"";
_l.setAlignment("CENTER");
RDebugUtils.currentLine=589871;
 //BA.debugLineNum = 589871;BA.debugLine="L.Text = Text";
_l.setText(_text);
RDebugUtils.currentLine=589873;
 //BA.debugLineNum = 589873;BA.debugLine="L.Font = fx.DefaultFont(15)";
_l.setFont(__ref._fx.DefaultFont(15));
RDebugUtils.currentLine=589876;
 //BA.debugLineNum = 589876;BA.debugLine="DesignerCreateView(Base,L,M)";
__ref._designercreateview(null,_base,_l,_m);
RDebugUtils.currentLine=589878;
 //BA.debugLineNum = 589878;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _addtotogglegroup(b4j.example.slradiobutton __ref,Object _togglegroup) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "addtotogglegroup"))
	return (anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "addtotogglegroup", new Object[] {_togglegroup});
anywheresoftware.b4j.object.JavaObject _tg = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub AddToToggleGroup(ToggleGroup As Object)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim TG As JavaObject";
_tg = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="If ToggleGroup = Null Then";
if (_togglegroup== null) { 
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="TG = NewToggleGroup";
_tg = __ref._newtogglegroup(null);
 }else {
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="TG = ToggleGroup";
_tg.setObject((java.lang.Object)(_togglegroup));
 };
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="TG.RunMethodJO(\"getToggles\",Null).RunMethod(\"add\"";
_tg.RunMethodJO("getToggles",(Object[])(__c.Null)).RunMethod("add",new Object[]{(Object)(__ref._rb.getObject())});
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Return TG";
if (true) return _tg;
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _gettogglegroup2(b4j.example.slradiobutton __ref,anywheresoftware.b4j.object.JavaObject _rbtn) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "gettogglegroup2"))
	return (anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "gettogglegroup2", new Object[] {_rbtn});
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub GetToggleGroup2(RBtn As JavaObject) As";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Return RBtn.RunMethod(\"getToggleGroup\",Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_rbtn.RunMethod("getToggleGroup",(Object[])(__c.Null))));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return null;
}
public boolean  _getselected(b4j.example.slradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "getselected"))
	return (Boolean) Debug.delegate(ba, "getselected", null);
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub getSelected As Boolean";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Return RB.Selected";
if (true) return __ref._rb.getSelected();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4j.objects.LabelWrapper  _getlabel(b4j.example.slradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "getlabel"))
	return (anywheresoftware.b4j.objects.LabelWrapper) Debug.delegate(ba, "getlabel", null);
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub getLabel As Label";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Return Label1";
if (true) return __ref._label1;
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _newtogglegroup(b4j.example.slradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "newtogglegroup"))
	return (anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "newtogglegroup", null);
anywheresoftware.b4j.object.JavaObject _togglegroup = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub NewToggleGroup As JavaObject";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Dim ToggleGroup As JavaObject";
_togglegroup = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="ToggleGroup.InitializeNewInstance(\"javafx.scene.c";
_togglegroup.InitializeNewInstance("javafx.scene.control.ToggleGroup",(Object[])(__c.Null));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Return ToggleGroup";
if (true) return _togglegroup;
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.example.slradiobutton __ref,anywheresoftware.b4j.object.JavaObject _jo) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "asjo"))
	return (anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_jo});
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub AsJo(JO As JavaObject) As JavaObject";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Return JO";
if (true) return _jo;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return null;
}
public String  _base_resize(b4j.example.slradiobutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "base_resize"))
	return (String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height});
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Label1.PrefWidth = Width";
__ref._label1.setPrefWidth(_width);
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Label1.PrefHeight = Height";
__ref._label1.setPrefHeight(_height);
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.slradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="Private mModule As Object 'ignore";
_mmodule = new Object();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Private RB As RadioButton";
_rb = new anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper();
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="Private RBJO As JavaObject";
_rbjo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="Private mForm As Form";
_mform = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="Public Const LOCATE_LEFT As String = \"LEFT\"";
_locate_left = "LEFT";
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="Public Const LOCATE_RIGHT As String = \"RIGHT\"";
_locate_right = "RIGHT";
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="Public Const LOCATE_TOP As String = \"TOP\"";
_locate_top = "TOP";
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="Public Const LOCATE_BOTTOM As String = \"BOTTOM\"";
_locate_bottom = "BOTTOM";
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="Private DesignerCVCalled As Boolean";
_designercvcalled = false;
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="Private CustomViewName As String = \"SLRadioButton";
_customviewname = "SLRadioButton";
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.LabelWrapper  _clonelabel(b4j.example.slradiobutton __ref,anywheresoftware.b4j.objects.LabelWrapper _lbl,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "clonelabel"))
	return (anywheresoftware.b4j.objects.LabelWrapper) Debug.delegate(ba, "clonelabel", new Object[] {_lbl,_eventname});
anywheresoftware.b4j.objects.LabelWrapper _clbl = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub CloneLabel(Lbl As Label,EventName As S";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim CLbl As Label";
_clbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="CLbl.Initialize(EventName)";
_clbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="CLbl.Alignment = Lbl.Alignment";
_clbl.setAlignment(_lbl.getAlignment());
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="CLbl.Alpha = Lbl.Alpha";
_clbl.setAlpha(_lbl.getAlpha());
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="If Lbl.ContextMenu.IsInitialized Then CLbl.Contex";
if (_lbl.getContextMenu().IsInitialized()) { 
_clbl.setContextMenu(_lbl.getContextMenu());};
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="CLbl.Enabled = Lbl.Enabled";
_clbl.setEnabled(_lbl.getEnabled());
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="CLbl.Font = Lbl.Font";
_clbl.setFont(_lbl.getFont());
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="CLbl.Id = Lbl.Id";
_clbl.setId(_lbl.getId());
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="CLbl.Style = Lbl.Style";
_clbl.setStyle(_lbl.getStyle());
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="CLbl.Tag = Lbl.Tag";
_clbl.setTag(_lbl.getTag());
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="CLbl.Text = Lbl.Text";
_clbl.setText(_lbl.getText());
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="CLbl.TextColor = Lbl.TextColor";
_clbl.setTextColor(_lbl.getTextColor());
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="CLbl.TextSize = Lbl.TextSize";
_clbl.setTextSize(_lbl.getTextSize());
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="If Lbl.TooltipText <> \"\" Then CLbl.TooltipText =";
if ((_lbl.getTooltipText()).equals("") == false) { 
_clbl.setTooltipText(_lbl.getTooltipText());};
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="CLbl.Visible = Lbl.Visible";
_clbl.setVisible(_lbl.getVisible());
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="CLbl.WrapText = Lbl.WrapText";
_clbl.setWrapText(_lbl.getWrapText());
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="Return CLbl";
if (true) return _clbl;
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4j.example.slradiobutton __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "designercreateview"))
	return (String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props});
anywheresoftware.b4j.object.JavaObject _lbljo = null;
boolean _fixedwidth = false;
String _locate = "";
anywheresoftware.b4j.object.JavaObject _hbox = null;
boolean _autogroup = false;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="If Not(Props.GetDefault(\"CVfromsetup\",False)) The";
if (__c.Not(BA.ObjectToBoolean(_props.GetDefault((Object)("CVfromsetup"),(Object)(__c.False))))) { 
__ref._designercvcalled = __c.True;};
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="mBase.StyleClasses.Add(\"slradiobutton\")";
__ref._mbase.getStyleClasses().Add((Object)("slradiobutton"));
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="Label1 = CloneLabel(Lbl,\"Label1\")";
__ref._label1 = __ref._clonelabel(null,_lbl,"Label1");
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="Dim LblJO As JavaObject = Label1";
_lbljo = new anywheresoftware.b4j.object.JavaObject();
_lbljo.setObject((java.lang.Object)(__ref._label1.getObject()));
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="LblJO.RunMethod(\"setMinWidth\",Array(-1.0))";
_lbljo.RunMethod("setMinWidth",new Object[]{(Object)(-1.0)});
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="RB.Initialize(\"RB\")";
__ref._rb.Initialize(ba,"RB");
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="RBJO = RB";
__ref._rbjo.setObject((java.lang.Object)(__ref._rb.getObject()));
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="Dim FixedWidth As Boolean = Props.GetDefault(\"Fix";
_fixedwidth = (_props.GetDefault((Object)("FixedWidth"),(Object)("False"))).equals((Object)("True"));
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="If FixedWidth Then";
if (_fixedwidth) { 
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="Label1.PrefHeight = Min(Label1.PrefHeight,RB.Hei";
__ref._label1.setPrefHeight(__c.Min(__ref._label1.getPrefHeight(),__ref._rb.getHeight()));
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="Dim Locate As String = Props.Get(\"Locate\")";
_locate = BA.ObjectToString(_props.Get((Object)("Locate")));
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="Select Locate";
switch (BA.switchObjectToInt(_locate,__ref._locate_left,__ref._locate_right,__ref._locate_top,__ref._locate_bottom)) {
case 0: {
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="Dim HBox As JavaObject";
_hbox = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="HBox.InitializeNewInstance(\"javafx.scene.layou";
_hbox.InitializeNewInstance("javafx.scene.layout.HBox",(Object[])(__c.Null));
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="HBox.RunMethodJO(\"getChildren\",Null).RunMethod";
_hbox.RunMethodJO("getChildren",(Object[])(__c.Null)).RunMethod("addAll",new Object[]{(Object)(new Object[]{(Object)(__ref._rb.getObject()),(Object)(__ref._label1.getObject())})});
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="mBase.AddNode(HBox,0,0,mBase.Width,mBase.Heigh";
__ref._mbase.AddNode((javafx.scene.Node)(_hbox.getObject()),0,0,__ref._mbase.getWidth(),__ref._mbase.getHeight());
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="HBox.RunMethod(\"setAlignment\",Array(\"CENTER_LE";
_hbox.RunMethod("setAlignment",new Object[]{(Object)("CENTER_LEFT")});
 break; }
case 1: {
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="Dim HBox As JavaObject";
_hbox = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="HBox.InitializeNewInstance(\"javafx.scene.layou";
_hbox.InitializeNewInstance("javafx.scene.layout.HBox",(Object[])(__c.Null));
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="HBox.RunMethodJO(\"getChildren\",Null).RunMethod";
_hbox.RunMethodJO("getChildren",(Object[])(__c.Null)).RunMethod("addAll",new Object[]{(Object)(new Object[]{(Object)(__ref._label1.getObject()),(Object)(__ref._rb.getObject())})});
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="mBase.AddNode(HBox,0,0,mBase.Width,mBase.Heigh";
__ref._mbase.AddNode((javafx.scene.Node)(_hbox.getObject()),0,0,__ref._mbase.getWidth(),__ref._mbase.getHeight());
RDebugUtils.currentLine=524318;
 //BA.debugLineNum = 524318;BA.debugLine="HBox.RunMethod(\"setAlignment\",Array(\"CENTER_LE";
_hbox.RunMethod("setAlignment",new Object[]{(Object)("CENTER_LEFT")});
 break; }
case 2: 
case 3: {
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="Dim LblJO As JavaObject = Label1";
_lbljo = new anywheresoftware.b4j.object.JavaObject();
_lbljo.setObject((java.lang.Object)(__ref._label1.getObject()));
RDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="LblJO.RunMethod(\"setGraphic\",Array(RB))";
_lbljo.RunMethod("setGraphic",new Object[]{(Object)(__ref._rb.getObject())});
RDebugUtils.currentLine=524322;
 //BA.debugLineNum = 524322;BA.debugLine="LblJO.RunMethod(\"setContentDisplay\",Array(Prop";
_lbljo.RunMethod("setContentDisplay",new Object[]{_props.Get((Object)("Locate"))});
RDebugUtils.currentLine=524323;
 //BA.debugLineNum = 524323;BA.debugLine="mBase.AddNode(Label1,0,0,mBase.Width,mBase.Hei";
__ref._mbase.AddNode((javafx.scene.Node)(__ref._label1.getObject()),0,0,__ref._mbase.getWidth(),__ref._mbase.getHeight());
 break; }
}
;
 }else {
RDebugUtils.currentLine=524326;
 //BA.debugLineNum = 524326;BA.debugLine="Dim LblJO As JavaObject = Label1";
_lbljo = new anywheresoftware.b4j.object.JavaObject();
_lbljo.setObject((java.lang.Object)(__ref._label1.getObject()));
RDebugUtils.currentLine=524327;
 //BA.debugLineNum = 524327;BA.debugLine="LblJO.RunMethod(\"setGraphic\",Array(RB))";
_lbljo.RunMethod("setGraphic",new Object[]{(Object)(__ref._rb.getObject())});
RDebugUtils.currentLine=524328;
 //BA.debugLineNum = 524328;BA.debugLine="LblJO.RunMethod(\"setContentDisplay\",Array(Props.";
_lbljo.RunMethod("setContentDisplay",new Object[]{_props.Get((Object)("Locate"))});
RDebugUtils.currentLine=524329;
 //BA.debugLineNum = 524329;BA.debugLine="mBase.AddNode(Label1,0,0,mBase.Width,mBase.Heigh";
__ref._mbase.AddNode((javafx.scene.Node)(__ref._label1.getObject()),0,0,__ref._mbase.getWidth(),__ref._mbase.getHeight());
 };
RDebugUtils.currentLine=524332;
 //BA.debugLineNum = 524332;BA.debugLine="Dim AutoGroup As Boolean = Props.GetDefault(\"Auto";
_autogroup = (_props.GetDefault((Object)("AutoGroup"),(Object)("False"))).equals((Object)("True"));
RDebugUtils.currentLine=524333;
 //BA.debugLineNum = 524333;BA.debugLine="Log(\"AG \" & AutoGroup)";
__c.Log("AG "+BA.ObjectToString(_autogroup));
RDebugUtils.currentLine=524334;
 //BA.debugLineNum = 524334;BA.debugLine="If AutoGroup Then FindToggleGroupAndAdd";
if (_autogroup) { 
__ref._findtogglegroupandadd(null);};
RDebugUtils.currentLine=524336;
 //BA.debugLineNum = 524336;BA.debugLine="RB.Selected = Props.GetDefault(\"Selected\",False)";
__ref._rb.setSelected(BA.ObjectToBoolean(_props.GetDefault((Object)("Selected"),(Object)(__c.False))));
RDebugUtils.currentLine=524338;
 //BA.debugLineNum = 524338;BA.debugLine="End Sub";
return "";
}
public String  _findtogglegroupandadd(b4j.example.slradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "findtogglegroupandadd"))
	return (String) Debug.delegate(ba, "findtogglegroupandadd", null);
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _parent = null;
anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper _rbtn = null;
anywheresoftware.b4j.object.JavaObject _tg = null;
Object _child = null;
Object _o = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub FindToggleGroupAndAdd";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim Parent As Pane = mBase.Parent";
_parent = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_parent.setObject((javafx.scene.layout.Pane)(__ref._mbase.getParent().getObject()));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Dim RBtn As RadioButton";
_rbtn = new anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper();
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Dim TG As JavaObject = Null";
_tg = new anywheresoftware.b4j.object.JavaObject();
_tg.setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="For Each Child As Object In Parent.GetAllViewsRec";
final anywheresoftware.b4a.BA.IterableList group4 = _parent.GetAllViewsRecursive();
final int groupLen4 = group4.getSize();
for (int index4 = 0;index4 < groupLen4 ;index4++){
_child = group4.Get(index4);
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="If Child Is RadioButton Then";
if (_child instanceof javafx.scene.control.RadioButton) { 
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="RBtn = Child";
_rbtn.setObject((javafx.scene.control.RadioButton)(_child));
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="TG = AsJo(RBtn).RunMethod(\"getToggleGroup\",Null";
_tg.setObject((java.lang.Object)(__ref._asjo(null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_rbtn.getObject()))).RunMethod("getToggleGroup",(Object[])(__c.Null))));
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="If TG.IsInitialized Then Exit";
if (_tg.IsInitialized()) { 
if (true) break;};
 };
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="If Child Is Label Then";
if (_child instanceof javafx.scene.control.Label) { 
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="Dim O As Object = AsJo(Child).RunMethod(\"getGra";
_o = __ref._asjo(null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_child))).RunMethod("getGraphic",(Object[])(__c.Null));
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="If O Is RadioButton Then";
if (_o instanceof javafx.scene.control.RadioButton) { 
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="RBtn = O";
_rbtn.setObject((javafx.scene.control.RadioButton)(_o));
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="TG = AsJo(RBtn).RunMethod(\"getToggleGroup\",Nul";
_tg.setObject((java.lang.Object)(__ref._asjo(null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_rbtn.getObject()))).RunMethod("getToggleGroup",(Object[])(__c.Null))));
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="If TG.IsInitialized Then Exit";
if (_tg.IsInitialized()) { 
if (true) break;};
 };
 };
 }
;
RDebugUtils.currentLine=1114132;
 //BA.debugLineNum = 1114132;BA.debugLine="If RBtn.IsInitialized And TG.IsInitialized Then";
if (_rbtn.IsInitialized() && _tg.IsInitialized()) { 
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="AddToToggleGroup(TG)";
__ref._addtotogglegroup(null,(Object)(_tg.getObject()));
 }else {
RDebugUtils.currentLine=1114135;
 //BA.debugLineNum = 1114135;BA.debugLine="AddToToggleGroup(Null)";
__ref._addtotogglegroup(null,__c.Null);
 };
RDebugUtils.currentLine=1114137;
 //BA.debugLineNum = 1114137;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(b4j.example.slradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "getbase"))
	return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null);
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return null;
}
public boolean  _getenabled(b4j.example.slradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "getenabled"))
	return (Boolean) Debug.delegate(ba, "getenabled", null);
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Return RB.Enabled";
if (true) return __ref._rb.getEnabled();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper  _getradiobutton(b4j.example.slradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "getradiobutton"))
	return (anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper) Debug.delegate(ba, "getradiobutton", null);
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub getRadioButton As RadioButton";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Return RB";
if (true) return __ref._rb;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _gettogglegroup(b4j.example.slradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "gettogglegroup"))
	return (anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "gettogglegroup", null);
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub getToggleGroup As JavaObject";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return RBJO.RunMethod(\"getToggleGroup\",Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._rbjo.RunMethod("getToggleGroup",(Object[])(__c.Null))));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return null;
}
public String  _settogglegroup(b4j.example.slradiobutton __ref,Object _togglegroup) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "settogglegroup"))
	return (String) Debug.delegate(ba, "settogglegroup", new Object[] {_togglegroup});
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub setToggleGroup (ToggleGroup As Object)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="RBJO.RunMethod(\"setToggleGroup\",Array(ToggleGroup";
__ref._rbjo.RunMethod("setToggleGroup",new Object[]{_togglegroup});
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public String  _label1_mouseclicked(b4j.example.slradiobutton __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "label1_mouseclicked"))
	return (String) Debug.delegate(ba, "label1_mouseclicked", new Object[] {_eventdata});
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub Label1_MouseClicked (EventData As Mous";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="If RB.Enabled Then";
if (__ref._rb.getEnabled()) { 
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="RB.RequestFocus";
__ref._rb.RequestFocus();
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="If RB.Selected = False Then RB.Selected = Not(RB";
if (__ref._rb.getSelected()==__c.False) { 
__ref._rb.setSelected(__c.Not(__ref._rb.getSelected()));};
 };
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="End Sub";
return "";
}
public String  _rb_mouseclicked(b4j.example.slradiobutton __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "rb_mouseclicked"))
	return (String) Debug.delegate(ba, "rb_mouseclicked", new Object[] {_eventdata});
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub RB_MouseClicked (EventData As MouseEvent)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="If SubExists(mModule,mEventName & \"_MouseClicked\"";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_MouseClicked")) { 
__c.CallSubNew2(ba,__ref._mmodule,__ref._meventname+"_MouseClicked",(Object)(_eventdata));};
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public String  _rb_selectedchange(b4j.example.slradiobutton __ref,boolean _selected) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "rb_selectedchange"))
	return (String) Debug.delegate(ba, "rb_selectedchange", new Object[] {_selected});
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub RB_SelectedChange(Selected As Boolean)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="If SubExists(mModule,mEventName & \"_SelectedChang";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_SelectedChange")) { 
__c.CallSubNew2(ba,__ref._mmodule,__ref._meventname+"_SelectedChange",(Object)(_selected));};
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4j.example.slradiobutton __ref,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "setenabled"))
	return (String) Debug.delegate(ba, "setenabled", new Object[] {_enabled});
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="RB.Enabled = Enabled";
__ref._rb.setEnabled(_enabled);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public String  _setselected(b4j.example.slradiobutton __ref,boolean _selected) throws Exception{
__ref = this;
RDebugUtils.currentModule="slradiobutton";
if (Debug.shouldDelegate(ba, "setselected"))
	return (String) Debug.delegate(ba, "setselected", new Object[] {_selected});
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub setSelected(Selected As Boolean)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="RB.Selected = Selected";
__ref._rb.setSelected(_selected);
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
}