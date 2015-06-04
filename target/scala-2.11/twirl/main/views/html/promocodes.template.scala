
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

class promocodes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[dto.Code],String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(codes: List[dto.Code], gencode:String, msg:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""

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

  def render(codes:List[dto.Code],gencode:String,msg:String): play.twirl.api.HtmlFormat.Appendable = apply(codes,gencode,msg)

  def f:((List[dto.Code],String,String) => play.twirl.api.HtmlFormat.Appendable) = (codes,gencode,msg) => apply(codes,gencode,msg)

  def ref: this.type = this

}


}

/**/
object promocodes extends promocodes_Scope0.promocodes
              /*
                  -- GENERATED --
                  DATE: Thu Jun 04 10:49:39 PKT 2015
                  SOURCE: C:/Users/abbas/Documents/GitHub/fmncodegen/app/views/promocodes.scala.html
                  HASH: d30871fd858becf88d89e2e2ca3e0148512fec03
                  MATRIX: 777->1|923->52|953->56|1220->297|1234->303|1286->346|1325->347|1355->350|1545->514|1596->556|1636->558|1666->561|1744->612|1760->619|1810->648|1857->665|1887->668|2657->1412|2685->1419|2717->1424|3174->1855|3208->1873|3248->1875|3280->1881|3309->1901|3348->1902|3380->1907|3426->1935|3438->1939|3477->1940|3509->1945|3549->1955|3582->1962|3615->1986|3654->1987|3687->1993|3764->2043|3777->2047|3808->2057|3837->2058|3887->2090|3900->2094|3939->2095|3972->2101|4049->2151|4062->2155|4093->2165|4132->2173|4165->2179|4197->2184|4210->2188|4241->2198|4284->2214|4297->2218|4328->2228|4371->2244|4384->2248|4417->2260|4460->2276|4473->2280|4510->2296|4553->2312|4566->2316|4599->2328|4654->2353|4688->2360|4815->2456|4845->2458
                  LINES: 27->1|32->1|34->3|43->12|43->12|43->12|43->12|44->13|49->18|49->18|49->18|50->19|51->20|51->20|51->20|53->22|54->23|86->55|86->55|88->57|104->73|104->73|104->73|105->74|105->74|105->74|106->75|107->76|107->76|107->76|108->77|109->78|110->79|110->79|110->79|111->80|111->80|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|113->82|113->82|114->83|114->83|114->83|114->83|115->84|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|122->91|124->93|131->100|132->101
                  -- GENERATED --
              */
          