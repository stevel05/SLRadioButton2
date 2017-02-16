package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 400);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper _radiobutton1 = null;
public static b4j.example.slradiobutton _rb = null;
public static b4j.example.slradiobutton _slradiobutton1 = null;
public static b4j.example.slradiobutton _rb1 = null;
public static b4j.example.slradiobutton _rb2 = null;
public static b4j.example.slradiobutton _rb3 = null;
public static b4j.example.slradiobutton_static _slradiobutton_static = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart"))
	return (String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args});
anywheresoftware.b4j.object.JavaObject _tg = null;
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\") 'Load the layou";
_mainform.getRootPane().LoadLayout(ba,"1");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="RB1.GroupRadioButtons(Array As SLRadioButton(RB1,";
_rb1._groupradiobuttons(null,(Object[])(new b4j.example.slradiobutton[]{_rb1,_rb2,_rb3}));
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="RB.Initialize(Me,\"RB\")";
_rb._initialize(null,ba,main.getObject(),"RB");
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="RB.Setup(\"From Code\",RB.LOCATE_RIGHT,False,False,";
_rb._setup(null,"From Code",_rb._locate_right,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,_mainform,(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(anywheresoftware.b4a.keywords.Common.Null)),(int) (30),(int) (130),(int) (170),(int) (30));
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="Dim TG As JavaObject = SLRadioButton1.AddToToggle";
_tg = new anywheresoftware.b4j.object.JavaObject();
_tg = _slradiobutton1._addtotogglegroup(null,(Object)(_slradiobutton1._gettogglegroup2(null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_radiobutton1.getObject()))).getObject()));
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="RB.AddToToggleGroup(TG)";
_rb._addtotogglegroup(null,(Object)(_tg.getObject()));
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="End Sub";
return "";
}
public static String  _radiobutton1_selectedchange(boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "radiobutton1_selectedchange"))
	return (String) Debug.delegate(ba, "radiobutton1_selectedchange", new Object[] {_selected});
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub RadioButton1_SelectedChange(Selected As Boolea";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Log(\"Standard Radiobutton in Designer Changed \" &";
anywheresoftware.b4a.keywords.Common.Log("Standard Radiobutton in Designer Changed "+BA.ObjectToString(_selected));
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _rb_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "rb_mouseclicked"))
	return (String) Debug.delegate(ba, "rb_mouseclicked", new Object[] {_eventdata});
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub RB_MouseClicked(EventData As MouseEvent)";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Log(SLRadioButton_Static.Cast(Sender).Selected)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_slradiobutton_static._cast((b4j.example.slradiobutton)(anywheresoftware.b4a.keywords.Common.Sender(ba)))._getselected(null)));
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public static String  _rb_selectedchange(boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "rb_selectedchange"))
	return (String) Debug.delegate(ba, "rb_selectedchange", new Object[] {_selected});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub RB_SelectedChange(Selected As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Log(\"Button From Code Changed \" & Selected)";
anywheresoftware.b4a.keywords.Common.Log("Button From Code Changed "+BA.ObjectToString(_selected));
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
return "";
}
public static String  _rbgroup1_selectedchange(boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "rbgroup1_selectedchange"))
	return (String) Debug.delegate(ba, "rbgroup1_selectedchange", new Object[] {_selected});
b4j.example.slradiobutton _slrb = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub RBGroup1_SelectedChange(Selected As Boolean)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Dim SLRb As SLRadioButton = Sender";
_slrb = (b4j.example.slradiobutton)(anywheresoftware.b4a.keywords.Common.Sender(ba));
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Log(\"FixedWidth button changed \"& SLRb.Label.Text";
anywheresoftware.b4a.keywords.Common.Log("FixedWidth button changed "+_slrb._getlabel(null).getText());
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="End Sub";
return "";
}
public static String  _slradiobutton1_selectedchange(boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "slradiobutton1_selectedchange"))
	return (String) Debug.delegate(ba, "slradiobutton1_selectedchange", new Object[] {_selected});
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub SLRadioButton1_SelectedChange(Selected As Bool";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Log(\"CustomView in Designer Changed \" & Selected)";
anywheresoftware.b4a.keywords.Common.Log("CustomView in Designer Changed "+BA.ObjectToString(_selected));
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
}