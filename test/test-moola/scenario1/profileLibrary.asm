<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="profileLibrary"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="self"/>
		<constant value="setTaggedValue"/>
		<constant value="MUMLMM!Element;"/>
		<constant value="1"/>
		<constant value="J"/>
		<constant value="2"/>
		<constant value="3"/>
		<constant value="J.oclIsUndefined():J"/>
		<constant value="J.not():J"/>
		<constant value="9"/>
		<constant value="Sequence"/>
		<constant value="#native"/>
		<constant value="QJ.first():J"/>
		<constant value="67"/>
		<constant value="J.isMultiValued(J):J"/>
		<constant value="45"/>
		<constant value="J.isComplexType(J):J"/>
		<constant value="39"/>
		<constant value="0"/>
		<constant value="4"/>
		<constant value="y"/>
		<constant value="J.resolveTemp(JJ):J"/>
		<constant value="J.getStereotypeApplications():J"/>
		<constant value="J.asSequence():J"/>
		<constant value="J.first():J"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="J.setValue(JJJ):J"/>
		<constant value="44"/>
		<constant value="62"/>
		<constant value="20:9-20:17"/>
		<constant value="20:9-20:34"/>
		<constant value="20:5-20:34"/>
		<constant value="42:8-42:20"/>
		<constant value="22:11-22:21"/>
		<constant value="22:36-22:44"/>
		<constant value="22:11-22:45"/>
		<constant value="22:7-22:45"/>
		<constant value="33:13-33:23"/>
		<constant value="33:38-33:50"/>
		<constant value="33:13-33:51"/>
		<constant value="33:9-33:51"/>
		<constant value="39:7-39:11"/>
		<constant value="39:21-39:31"/>
		<constant value="39:33-39:45"/>
		<constant value="39:47-39:55"/>
		<constant value="39:71-39:81"/>
		<constant value="39:94-39:95"/>
		<constant value="39:97-39:100"/>
		<constant value="39:71-39:101"/>
		<constant value="39:71-39:129"/>
		<constant value="39:71-39:142"/>
		<constant value="39:71-39:150"/>
		<constant value="39:47-39:151"/>
		<constant value="39:7-39:152"/>
		<constant value="36:7-36:11"/>
		<constant value="36:21-36:31"/>
		<constant value="36:33-36:45"/>
		<constant value="36:47-36:55"/>
		<constant value="36:7-36:56"/>
		<constant value="33:5-40:10"/>
		<constant value="24:13-24:23"/>
		<constant value="24:38-24:50"/>
		<constant value="24:13-24:51"/>
		<constant value="24:9-24:51"/>
		<constant value="30:7-30:11"/>
		<constant value="30:21-30:31"/>
		<constant value="30:33-30:45"/>
		<constant value="30:47-30:57"/>
		<constant value="30:70-30:78"/>
		<constant value="30:80-30:83"/>
		<constant value="30:47-30:84"/>
		<constant value="30:47-30:112"/>
		<constant value="30:47-30:125"/>
		<constant value="30:47-30:133"/>
		<constant value="30:7-30:134"/>
		<constant value="27:7-27:11"/>
		<constant value="27:21-27:31"/>
		<constant value="27:33-27:45"/>
		<constant value="27:47-27:55"/>
		<constant value="27:7-27:56"/>
		<constant value="24:5-31:10"/>
		<constant value="22:3-41:8"/>
		<constant value="20:1-43:6"/>
		<constant value="c"/>
		<constant value="stereotype"/>
		<constant value="propertyName"/>
		<constant value="newValue"/>
		<constant value="isMultiValued"/>
		<constant value="OclParametrizedType"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="J.oclIsKindOf(J):J"/>
		<constant value="46:9-46:13"/>
		<constant value="46:37-46:43"/>
		<constant value="46:26-46:44"/>
		<constant value="46:9-46:45"/>
		<constant value="attr"/>
		<constant value="isComplexType"/>
		<constant value="Property"/>
		<constant value="UMLMM"/>
		<constant value="J.allInstances():J"/>
		<constant value="name"/>
		<constant value="J.=(J):J"/>
		<constant value="B.not():B"/>
		<constant value="17"/>
		<constant value="CJ.asSequence():QJ"/>
		<constant value="type"/>
		<constant value="Stereotype"/>
		<constant value="J.oclIsTypeOf(J):J"/>
		<constant value="50:9-50:23"/>
		<constant value="50:9-50:38"/>
		<constant value="50:48-50:49"/>
		<constant value="50:48-50:54"/>
		<constant value="50:57-50:72"/>
		<constant value="50:48-50:72"/>
		<constant value="50:9-50:73"/>
		<constant value="50:9-50:78"/>
		<constant value="50:91-50:107"/>
		<constant value="50:9-50:108"/>
		<constant value="e"/>
		<constant value="taggedValueName"/>
	</cp>
	<operation name="1">
		<context type="2"/>
		<parameters>
		</parameters>
		<code>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="3" begin="0" end="-1"/>
		</localvariabletable>
	</operation>
	<operation name="4">
		<context type="5"/>
		<parameters>
			<parameter name="6" type="7"/>
			<parameter name="8" type="7"/>
			<parameter name="9" type="7"/>
		</parameters>
		<code>
			<load arg="9"/>
			<call arg="10"/>
			<call arg="11"/>
			<if arg="12"/>
			<push arg="13"/>
			<push arg="14"/>
			<new/>
			<call arg="15"/>
			<goto arg="16"/>
			<getasm/>
			<load arg="9"/>
			<call arg="17"/>
			<call arg="11"/>
			<if arg="18"/>
			<getasm/>
			<load arg="8"/>
			<call arg="19"/>
			<call arg="11"/>
			<if arg="20"/>
			<load arg="21"/>
			<load arg="6"/>
			<load arg="8"/>
			<push arg="13"/>
			<push arg="14"/>
			<new/>
			<load arg="9"/>
			<iterate/>
			<store arg="22"/>
			<getasm/>
			<load arg="22"/>
			<push arg="23"/>
			<call arg="24"/>
			<call arg="25"/>
			<call arg="26"/>
			<call arg="27"/>
			<call arg="28"/>
			<enditerate/>
			<call arg="29"/>
			<goto arg="30"/>
			<load arg="21"/>
			<load arg="6"/>
			<load arg="8"/>
			<load arg="9"/>
			<call arg="29"/>
			<goto arg="16"/>
			<getasm/>
			<load arg="8"/>
			<call arg="19"/>
			<call arg="11"/>
			<if arg="31"/>
			<load arg="21"/>
			<load arg="6"/>
			<load arg="8"/>
			<getasm/>
			<load arg="9"/>
			<push arg="23"/>
			<call arg="24"/>
			<call arg="25"/>
			<call arg="26"/>
			<call arg="27"/>
			<call arg="29"/>
			<goto arg="16"/>
			<load arg="21"/>
			<load arg="6"/>
			<load arg="8"/>
			<load arg="9"/>
			<call arg="29"/>
		</code>
		<linenumbertable>
			<lne id="32" begin="0" end="0"/>
			<lne id="33" begin="0" end="1"/>
			<lne id="34" begin="0" end="2"/>
			<lne id="35" begin="4" end="7"/>
			<lne id="36" begin="9" end="9"/>
			<lne id="37" begin="10" end="10"/>
			<lne id="38" begin="9" end="11"/>
			<lne id="39" begin="9" end="12"/>
			<lne id="40" begin="14" end="14"/>
			<lne id="41" begin="15" end="15"/>
			<lne id="42" begin="14" end="16"/>
			<lne id="43" begin="14" end="17"/>
			<lne id="44" begin="19" end="19"/>
			<lne id="45" begin="20" end="20"/>
			<lne id="46" begin="21" end="21"/>
			<lne id="47" begin="25" end="25"/>
			<lne id="48" begin="28" end="28"/>
			<lne id="49" begin="29" end="29"/>
			<lne id="50" begin="30" end="30"/>
			<lne id="51" begin="28" end="31"/>
			<lne id="52" begin="28" end="32"/>
			<lne id="53" begin="28" end="33"/>
			<lne id="54" begin="28" end="34"/>
			<lne id="55" begin="22" end="36"/>
			<lne id="56" begin="19" end="37"/>
			<lne id="57" begin="39" end="39"/>
			<lne id="58" begin="40" end="40"/>
			<lne id="59" begin="41" end="41"/>
			<lne id="60" begin="42" end="42"/>
			<lne id="61" begin="39" end="43"/>
			<lne id="62" begin="14" end="43"/>
			<lne id="63" begin="45" end="45"/>
			<lne id="64" begin="46" end="46"/>
			<lne id="65" begin="45" end="47"/>
			<lne id="66" begin="45" end="48"/>
			<lne id="67" begin="50" end="50"/>
			<lne id="68" begin="51" end="51"/>
			<lne id="69" begin="52" end="52"/>
			<lne id="70" begin="53" end="53"/>
			<lne id="71" begin="54" end="54"/>
			<lne id="72" begin="55" end="55"/>
			<lne id="73" begin="53" end="56"/>
			<lne id="74" begin="53" end="57"/>
			<lne id="75" begin="53" end="58"/>
			<lne id="76" begin="53" end="59"/>
			<lne id="77" begin="50" end="60"/>
			<lne id="78" begin="62" end="62"/>
			<lne id="79" begin="63" end="63"/>
			<lne id="80" begin="64" end="64"/>
			<lne id="81" begin="65" end="65"/>
			<lne id="82" begin="62" end="66"/>
			<lne id="83" begin="45" end="66"/>
			<lne id="84" begin="9" end="66"/>
			<lne id="85" begin="0" end="66"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="86" begin="27" end="35"/>
			<lve slot="0" name="3" begin="0" end="66"/>
			<lve slot="1" name="87" begin="0" end="66"/>
			<lve slot="2" name="88" begin="0" end="66"/>
			<lve slot="3" name="89" begin="0" end="66"/>
		</localvariabletable>
	</operation>
	<operation name="90">
		<context type="2"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<load arg="6"/>
			<push arg="91"/>
			<push arg="14"/>
			<new/>
			<dup/>
			<push arg="92"/>
			<pcall arg="93"/>
			<dup/>
			<push arg="94"/>
			<push arg="14"/>
			<findme/>
			<pcall arg="95"/>
			<call arg="96"/>
		</code>
		<linenumbertable>
			<lne id="97" begin="0" end="0"/>
			<lne id="98" begin="8" end="10"/>
			<lne id="99" begin="1" end="11"/>
			<lne id="100" begin="0" end="12"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="3" begin="0" end="12"/>
			<lve slot="1" name="101" begin="0" end="12"/>
		</localvariabletable>
	</operation>
	<operation name="102">
		<context type="2"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<push arg="13"/>
			<push arg="14"/>
			<new/>
			<push arg="103"/>
			<push arg="104"/>
			<findme/>
			<call arg="105"/>
			<iterate/>
			<store arg="8"/>
			<load arg="8"/>
			<get arg="106"/>
			<load arg="6"/>
			<call arg="107"/>
			<call arg="108"/>
			<if arg="109"/>
			<load arg="8"/>
			<call arg="28"/>
			<enditerate/>
			<call arg="110"/>
			<call arg="15"/>
			<get arg="111"/>
			<push arg="112"/>
			<push arg="104"/>
			<findme/>
			<call arg="113"/>
		</code>
		<linenumbertable>
			<lne id="114" begin="3" end="5"/>
			<lne id="115" begin="3" end="6"/>
			<lne id="116" begin="9" end="9"/>
			<lne id="117" begin="9" end="10"/>
			<lne id="118" begin="11" end="11"/>
			<lne id="119" begin="9" end="12"/>
			<lne id="120" begin="0" end="19"/>
			<lne id="121" begin="0" end="20"/>
			<lne id="122" begin="21" end="23"/>
			<lne id="123" begin="0" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="124" begin="8" end="16"/>
			<lve slot="0" name="3" begin="0" end="24"/>
			<lve slot="1" name="125" begin="0" end="24"/>
		</localvariabletable>
	</operation>
</asm>
