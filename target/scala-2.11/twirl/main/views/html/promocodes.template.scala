
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object promocodes_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class promocodes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[dto.Code],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(codes: List[dto.Code], gencode:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
<head>
<title>FMN Promo Code Gen</title>

</head>
<body
	style="padding-right: 15px; padding-left: 100px; margin-right: auto; margin-left: auto; font-family:"HelveticaNeue", Helvetica, Arial, sans-serif;">
	"""),_display_(/*12.3*/helper/*12.9*/.form(action=routes.Application.generate())/*12.52*/{_display_(Seq[Any](format.raw/*12.53*/("""
	"""),format.raw/*13.2*/("""<div class="page-header background-color: #0480be">
		<p style="font-size: 140%; color: #60605E;">
			<b> FMN <small> Promo Codes</small></b>
		</p>
	</div>
	"""),_display_(/*18.3*/if(request.cookies.get("message") != null)/*18.45*/ {_display_(Seq[Any](format.raw/*18.47*/("""
	"""),format.raw/*19.2*/("""<div>
		<p style="font-size: 120%; color: gray;">"""),_display_(/*20.45*/request/*20.52*/.cookies.get("message").value),format.raw/*20.81*/("""</p>
	</div>
	""")))}),format.raw/*22.3*/("""
	"""),format.raw/*23.2*/("""<table
		style="background-color: transparent; text-align: left; width: 60%; max-width: 100%; margin-bottom: 20px; padding: 5px; line-height: 1.3; vertical-align: top; border-top: 1px; vertical-align: bottom; border-bottom: 1px solid #ddd;">

		<tr>
			<td>

				<div>
					<table>
						<tr>
							<td><label>Full Discount:</label> <input type="radio" name="type" value="fulldiscount"
								class="cb" /></td>
							<td><label>75% Dicount:</label> <input type="radio" name="type" value="discount75"
								class="cb" /></td>

							</label>
							</td>
						</tr>
						<tr>
							<td><button>Generate Code</button></td>
						</tr>
						
					</table>




				</div>
			</td>

		</tr>
		
	</table>
	"""),_display_(/*55.3*/gencode),format.raw/*55.10*/("""

	"""),format.raw/*57.2*/("""<div>

		<table
			style="background-color: transparent; text-align: left; width: 60%; max-width: 60%; margin-bottom: 20px; padding: 0px; line-height: 1.3; vertical-align: top; border-top: 1px; vertical-align: bottom; border-bottom: 2px solid #ddd; border-top: 2px solid #ddd;">


			<tr>
				<th></th>
				<th>Code</th>
				<th>Type</th>
				<th>Used</th>
				<th>Assigned</th>
				<th>Used By</th>

			</tr>

			"""),_display_(/*73.5*/for(code <- codes) yield /*73.23*/ {_display_(Seq[Any](format.raw/*73.25*/("""
			"""),_display_(/*74.5*/if(code.getIsUsed())/*74.25*/{_display_(Seq[Any](format.raw/*74.26*/("""
			"""),format.raw/*75.4*/("""<tr bgcolor="#EBEBE0">
			""")))}/*76.5*/else/*76.9*/{_display_(Seq[Any](format.raw/*76.10*/("""
			"""),format.raw/*77.4*/("""<tr>
			""")))}),format.raw/*78.5*/("""
				"""),_display_(/*79.6*/if(code.getIsAssigned())/*79.30*/{_display_(Seq[Any](format.raw/*79.31*/("""
				"""),format.raw/*80.5*/("""<td><input type="checkbox" name="assigned" value="""),_display_(/*80.55*/code/*80.59*/.getCode()),format.raw/*80.69*/(""" """),format.raw/*80.70*/("""disabled="disabled"></td>
				""")))}/*81.6*/else/*81.10*/{_display_(Seq[Any](format.raw/*81.11*/("""
				"""),format.raw/*82.5*/("""<td><input type="checkbox" name="assigned" value="""),_display_(/*82.55*/code/*82.59*/.getCode()),format.raw/*82.69*/("""></td> """)))}),format.raw/*82.77*/("""
				"""),format.raw/*83.5*/("""<td>"""),_display_(/*83.10*/code/*83.14*/.getCode()),format.raw/*83.24*/("""</td>
				<td>"""),_display_(/*84.10*/code/*84.14*/.getType()),format.raw/*84.24*/("""</td>
				<td>"""),_display_(/*85.10*/code/*85.14*/.getIsUsed()),format.raw/*85.26*/("""</td>
				<td>"""),_display_(/*86.10*/code/*86.14*/.getIsAssigned()),format.raw/*86.30*/("""</td>
				<td>"""),_display_(/*87.10*/code/*87.14*/.getUsedBy()),format.raw/*87.26*/("""</td>


			</tr>
			""")))}),format.raw/*91.5*/("""

			"""),format.raw/*93.4*/("""<tr>
				<td><input type="submit" value="Assign" /></td>
			</tr>
		</table>


	</div>
	""")))}),format.raw/*100.3*/("""
"""),format.raw/*101.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(codes:List[dto.Code],gencode:String): play.twirl.api.HtmlFormat.Appendable = apply(codes,gencode)

  def f:((List[dto.Code],String) => play.twirl.api.HtmlFormat.Appendable) = (codes,gencode) => apply(codes,gencode)

  def ref: this.type = this

}


}

/**/
object promocodes extends promocodes_Scope0.promocodes
              /*
                  -- GENERATED --
                  DATE: Wed Jun 03 17:23:23 PKT 2015
                  SOURCE: C:/Users/abbas/Documents/GitHub/FMN-CodeGen/fmn-pcgen/app/views/promocodes.scala.html
                  HASH: 65d03f7ef99788c7b214629992b21bce2d53d919
                  MATRIX: 770->1|904->40|934->44|1201->285|1215->291|1267->334|1306->335|1336->338|1526->502|1577->544|1617->546|1647->549|1725->600|1741->607|1791->636|1838->653|1868->656|2638->1400|2666->1407|2698->1412|3155->1843|3189->1861|3229->1863|3261->1869|3290->1889|3329->1890|3361->1895|3407->1923|3419->1927|3458->1928|3490->1933|3530->1943|3563->1950|3596->1974|3635->1975|3668->1981|3745->2031|3758->2035|3789->2045|3818->2046|3868->2078|3881->2082|3920->2083|3953->2089|4030->2139|4043->2143|4074->2153|4113->2161|4146->2167|4178->2172|4191->2176|4222->2186|4265->2202|4278->2206|4309->2216|4352->2232|4365->2236|4398->2248|4441->2264|4454->2268|4491->2284|4534->2300|4547->2304|4580->2316|4635->2341|4669->2348|4796->2444|4826->2446
                  LINES: 27->1|32->1|34->3|43->12|43->12|43->12|43->12|44->13|49->18|49->18|49->18|50->19|51->20|51->20|51->20|53->22|54->23|86->55|86->55|88->57|104->73|104->73|104->73|105->74|105->74|105->74|106->75|107->76|107->76|107->76|108->77|109->78|110->79|110->79|110->79|111->80|111->80|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|113->82|113->82|114->83|114->83|114->83|114->83|115->84|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|122->91|124->93|131->100|132->101
                  -- GENERATED --
              */
          