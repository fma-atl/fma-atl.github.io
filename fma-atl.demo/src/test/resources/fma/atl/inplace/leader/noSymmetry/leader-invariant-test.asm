<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="leader"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="enumLiteralType"/>
		<constant value="eLeader"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="EnumLiteral"/>
		<constant value="J.oclType():J"/>
		<constant value="Element"/>
		<constant value="RefiningTrace"/>
		<constant value="sourceElement"/>
		<constant value="persistedSourceElement"/>
		<constant value="J.registerWeavingHelper(SS):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="A.__applyRefiningTrace__():V"/>
		<constant value="7:1-7:6"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__applyReverseBinding"/>
		<constant value="11"/>
		<constant value="J.__asElement():J"/>
		<constant value="0"/>
		<constant value="MRefiningTrace!Element;.setProperty(SJ):V"/>
		<constant value="19"/>
		<constant value="J.__applyReverseBinding(SJ):V"/>
		<constant value="propertyName"/>
		<constant value="target"/>
		<constant value="__matcher__"/>
		<constant value="__exec__"/>
		<constant value="setProperty"/>
		<constant value="MRefiningTrace!Element;"/>
		<constant value="3"/>
		<constant value="B"/>
		<constant value="Slot"/>
		<constant value="isAssignment"/>
		<constant value="J.__toValue():J"/>
		<constant value="22"/>
		<constant value="A.__collectionToValue(QJ):J"/>
		<constant value="slots"/>
		<constant value="__applyRefiningTrace__"/>
		<constant value="refiningTrace"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="B.not():B"/>
		<constant value="20"/>
		<constant value="type"/>
		<constant value="metamodel"/>
		<constant value="21"/>
		<constant value="37"/>
		<constant value="J.refUnsetValue(S):J"/>
		<constant value="J.__fromValue():J"/>
		<constant value="J.refSetValue(SJ):J"/>
		<constant value="toDelete"/>
		<constant value="60"/>
		<constant value="QJ.first():J"/>
		<constant value="61"/>
		<constant value="__collectionToValue"/>
		<constant value="CJ"/>
		<constant value="CollectionVal"/>
		<constant value="elements"/>
		<constant value="c"/>
		<constant value="__toValue"/>
		<constant value="BooleanVal"/>
		<constant value="I"/>
		<constant value="IntegerVal"/>
		<constant value="D"/>
		<constant value="RealVal"/>
		<constant value="StringVal"/>
		<constant value="ElementVal"/>
		<constant value="J.=(J):B"/>
		<constant value="28"/>
		<constant value="NullVal"/>
		<constant value="EnumLiteralVal"/>
		<constant value="J.toString():S"/>
		<constant value="__asElement"/>
		<constant value="__fromValue"/>
		<constant value="MRefiningTrace!CollectionVal;"/>
		<constant value="QJ.append(J):QJ"/>
		<constant value="MRefiningTrace!BooleanVal;"/>
		<constant value="MRefiningTrace!IntegerVal;"/>
		<constant value="MRefiningTrace!RealVal;"/>
		<constant value="MRefiningTrace!StringVal;"/>
		<constant value="MRefiningTrace!NullVal;"/>
		<constant value="MRefiningTrace!ElementVal;"/>
		<constant value="MRefiningTrace!EnumLiteralVal;"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<field name="5" type="4"/>
	<field name="6" type="4"/>
	<operation name="7">
		<context type="8"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="9"/>
			<push arg="10"/>
			<new/>
			<dup/>
			<push arg="11"/>
			<pcall arg="12"/>
			<dup/>
			<push arg="13"/>
			<push arg="10"/>
			<new/>
			<dup/>
			<push arg="14"/>
			<pcall arg="12"/>
			<pcall arg="15"/>
			<set arg="3"/>
			<getasm/>
			<push arg="16"/>
			<push arg="10"/>
			<new/>
			<call arg="17"/>
			<set arg="5"/>
			<push arg="18"/>
			<push arg="19"/>
			<findme/>
			<push arg="20"/>
			<push arg="21"/>
			<pcall arg="22"/>
			<getasm/>
			<pushf/>
			<set arg="6"/>
			<getasm/>
			<push arg="23"/>
			<push arg="10"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="24"/>
			<getasm/>
			<pcall arg="25"/>
			<getasm/>
			<pcall arg="26"/>
		</code>
		<linenumbertable>
			<lne id="27" begin="29" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="41"/>
		</localvariabletable>
	</operation>
	<operation name="29">
		<context type="8"/>
		<parameters>
			<parameter name="30" type="4"/>
		</parameters>
		<code>
			<load arg="30"/>
			<getasm/>
			<get arg="3"/>
			<call arg="31"/>
			<if arg="32"/>
			<getasm/>
			<get arg="1"/>
			<load arg="30"/>
			<call arg="33"/>
			<dup/>
			<call arg="34"/>
			<if arg="35"/>
			<load arg="30"/>
			<call arg="36"/>
			<goto arg="37"/>
			<pop/>
			<load arg="30"/>
			<goto arg="38"/>
			<push arg="39"/>
			<push arg="10"/>
			<new/>
			<load arg="30"/>
			<iterate/>
			<store arg="40"/>
			<getasm/>
			<load arg="40"/>
			<call arg="41"/>
			<call arg="42"/>
			<enditerate/>
			<call arg="43"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="44" begin="23" end="27"/>
			<lve slot="0" name="28" begin="0" end="29"/>
			<lve slot="1" name="45" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="46">
		<context type="8"/>
		<parameters>
			<parameter name="30" type="4"/>
			<parameter name="40" type="47"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="30"/>
			<call arg="33"/>
			<load arg="30"/>
			<load arg="40"/>
			<call arg="48"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="6"/>
			<lve slot="1" name="45" begin="0" end="6"/>
			<lve slot="2" name="49" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="50">
		<context type="4"/>
		<parameters>
			<parameter name="30" type="47"/>
			<parameter name="40" type="4"/>
		</parameters>
		<code>
			<load arg="40"/>
			<getasm/>
			<get arg="3"/>
			<call arg="31"/>
			<if arg="51"/>
			<load arg="40"/>
			<call arg="52"/>
			<load arg="30"/>
			<load arg="53"/>
			<call arg="54"/>
			<goto arg="55"/>
			<load arg="40"/>
			<iterate/>
			<load arg="53"/>
			<swap/>
			<load arg="30"/>
			<swap/>
			<pcall arg="56"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="18"/>
			<lve slot="1" name="57" begin="0" end="18"/>
			<lve slot="2" name="58" begin="0" end="18"/>
		</localvariabletable>
	</operation>
	<operation name="59">
		<context type="8"/>
		<parameters>
		</parameters>
		<code>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="-1"/>
		</localvariabletable>
	</operation>
	<operation name="60">
		<context type="8"/>
		<parameters>
		</parameters>
		<code>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="-1"/>
		</localvariabletable>
	</operation>
	<operation name="61">
		<context type="62"/>
		<parameters>
			<parameter name="30" type="47"/>
			<parameter name="40" type="4"/>
			<parameter name="63" type="64"/>
		</parameters>
		<code>
			<load arg="53"/>
			<push arg="65"/>
			<push arg="19"/>
			<new/>
			<dup/>
			<load arg="63"/>
			<set arg="66"/>
			<dup/>
			<load arg="30"/>
			<set arg="49"/>
			<dup/>
			<load arg="40"/>
			<dup/>
			<getasm/>
			<get arg="3"/>
			<call arg="31"/>
			<if arg="55"/>
			<call arg="67"/>
			<goto arg="68"/>
			<getasm/>
			<swap/>
			<call arg="69"/>
			<set arg="45"/>
			<set arg="70"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="23"/>
			<lve slot="1" name="57" begin="0" end="23"/>
			<lve slot="2" name="45" begin="0" end="23"/>
			<lve slot="3" name="66" begin="0" end="23"/>
		</localvariabletable>
	</operation>
	<operation name="71">
		<context type="8"/>
		<parameters>
		</parameters>
		<code>
			<push arg="18"/>
			<push arg="19"/>
			<findme/>
			<push arg="72"/>
			<call arg="73"/>
			<dup/>
			<iterate/>
			<dup/>
			<get arg="20"/>
			<call arg="34"/>
			<call arg="74"/>
			<if arg="75"/>
			<dup/>
			<get arg="76"/>
			<swap/>
			<dup_x1/>
			<get arg="77"/>
			<new/>
			<set arg="20"/>
			<goto arg="78"/>
			<pop/>
			<enditerate/>
			<dup/>
			<iterate/>
			<dup/>
			<get arg="20"/>
			<swap/>
			<get arg="70"/>
			<iterate/>
			<dup/>
			<get arg="66"/>
			<call arg="74"/>
			<if arg="79"/>
			<dup_x1/>
			<get arg="49"/>
			<call arg="80"/>
			<swap/>
			<dup/>
			<get arg="49"/>
			<swap/>
			<get arg="45"/>
			<call arg="81"/>
			<call arg="82"/>
			<enditerate/>
			<pop/>
			<enditerate/>
			<iterate/>
			<dup/>
			<get arg="83"/>
			<call arg="74"/>
			<if arg="84"/>
			<dup/>
			<get arg="20"/>
			<delete/>
			<push arg="39"/>
			<push arg="10"/>
			<new/>
			<call arg="85"/>
			<set arg="20"/>
			<goto arg="86"/>
			<pop/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="61"/>
		</localvariabletable>
	</operation>
	<operation name="87">
		<context type="8"/>
		<parameters>
			<parameter name="30" type="88"/>
		</parameters>
		<code>
			<push arg="89"/>
			<push arg="19"/>
			<new/>
			<load arg="30"/>
			<iterate/>
			<call arg="67"/>
			<swap/>
			<dup_x1/>
			<swap/>
			<set arg="90"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="10"/>
			<lve slot="1" name="91" begin="0" end="10"/>
		</localvariabletable>
	</operation>
	<operation name="92">
		<context type="64"/>
		<parameters>
		</parameters>
		<code>
			<push arg="93"/>
			<push arg="19"/>
			<new/>
			<dup/>
			<load arg="53"/>
			<set arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="92">
		<context type="94"/>
		<parameters>
		</parameters>
		<code>
			<push arg="95"/>
			<push arg="19"/>
			<new/>
			<dup/>
			<load arg="53"/>
			<set arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="92">
		<context type="96"/>
		<parameters>
		</parameters>
		<code>
			<push arg="97"/>
			<push arg="19"/>
			<new/>
			<dup/>
			<load arg="53"/>
			<set arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="92">
		<context type="47"/>
		<parameters>
		</parameters>
		<code>
			<push arg="98"/>
			<push arg="19"/>
			<new/>
			<dup/>
			<load arg="53"/>
			<set arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="92">
		<context type="62"/>
		<parameters>
		</parameters>
		<code>
			<push arg="99"/>
			<push arg="19"/>
			<new/>
			<dup/>
			<load arg="53"/>
			<set arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="92">
		<context type="4"/>
		<parameters>
		</parameters>
		<code>
			<load arg="53"/>
			<call arg="17"/>
			<getasm/>
			<get arg="5"/>
			<call arg="100"/>
			<if arg="78"/>
			<load arg="53"/>
			<call arg="34"/>
			<if arg="37"/>
			<push arg="99"/>
			<push arg="19"/>
			<new/>
			<dup/>
			<load arg="53"/>
			<call arg="52"/>
			<set arg="45"/>
			<goto arg="101"/>
			<push arg="102"/>
			<push arg="19"/>
			<new/>
			<goto arg="101"/>
			<push arg="103"/>
			<push arg="19"/>
			<new/>
			<dup/>
			<load arg="53"/>
			<call arg="104"/>
			<set arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="105">
		<context type="4"/>
		<parameters>
		</parameters>
		<code>
			<push arg="18"/>
			<push arg="19"/>
			<new/>
			<dup/>
			<load arg="53"/>
			<set arg="20"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="105">
		<context type="62"/>
		<parameters>
		</parameters>
		<code>
			<load arg="53"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="0"/>
		</localvariabletable>
	</operation>
	<operation name="106">
		<context type="107"/>
		<parameters>
		</parameters>
		<code>
			<push arg="39"/>
			<push arg="10"/>
			<new/>
			<load arg="53"/>
			<get arg="90"/>
			<iterate/>
			<call arg="81"/>
			<call arg="108"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="8"/>
		</localvariabletable>
	</operation>
	<operation name="106">
		<context type="109"/>
		<parameters>
		</parameters>
		<code>
			<load arg="53"/>
			<get arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="106">
		<context type="110"/>
		<parameters>
		</parameters>
		<code>
			<load arg="53"/>
			<get arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="106">
		<context type="111"/>
		<parameters>
		</parameters>
		<code>
			<load arg="53"/>
			<get arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="106">
		<context type="112"/>
		<parameters>
		</parameters>
		<code>
			<load arg="53"/>
			<get arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="106">
		<context type="113"/>
		<parameters>
		</parameters>
		<code>
			<push arg="39"/>
			<push arg="10"/>
			<new/>
			<call arg="85"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="106">
		<context type="114"/>
		<parameters>
		</parameters>
		<code>
			<load arg="53"/>
			<get arg="45"/>
			<get arg="20"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="2"/>
		</localvariabletable>
	</operation>
	<operation name="106">
		<context type="115"/>
		<parameters>
		</parameters>
		<code>
			<push arg="16"/>
			<push arg="10"/>
			<new/>
			<dup/>
			<load arg="53"/>
			<get arg="45"/>
			<set arg="49"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="28" begin="0" end="6"/>
		</localvariabletable>
	</operation>
</asm>
