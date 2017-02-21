#SLRadioButtons

This customview class is a Wrap based on the example provided here : http://stackoverflow.com/questions/39942123/how-to-change-the-position-of-a-radiobuttons-label. Which adds a radiobutton as a graphic to a label.

This allows the radiobutton to be positioned to the left (standard), above, below or to the right of it's label.

I have also added methods to allow adding the RadioButons to a Toggle group which needs to be done manually. You can get the existing ToggleGroup from a RadioButton which enables adding a new button to an existing group, including standard RadioButtons. See the very small demo for an example.

You can also add them from code.

**Update 0.2:**
Added :
* AutoGroup - Will find other radiobuttons on the same pane and add the new Radiobutton to the same group, or create a new one if there is none
* Fixed width: - Uses an HBox instead of adding the Radiobutton to a label. Radiobuttons will align to the right of the label. (only really useful for right positioned RadioButtons)
* Enabled Property