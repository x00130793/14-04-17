
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object basket_Scope0 {
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

class basket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.users.Customer,models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models._

Seq[Any](format.raw/*1.124*/("""

"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Shopping Basket", user, categories, catId, filter)/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Size</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*36.18*/if(customer.getBasket() != null)/*36.50*/ {_display_(Seq[Any](format.raw/*36.52*/("""
                    """),format.raw/*37.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*38.22*/for(i <- customer.getBasket().getBasketItems()) yield /*38.69*/ {_display_(Seq[Any](format.raw/*38.71*/("""
                    """),format.raw/*39.21*/("""<tr>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getName),format.raw/*40.50*/("""</td>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getProduct.getDescription()),format.raw/*41.59*/("""</td>
			<td>"""),_display_(/*42.9*/i/*42.10*/.getProduct.getSize()),format.raw/*42.31*/("""</td>
                        <td>&euro; """),_display_(/*43.37*/("%.2f".format(i.getPrice))),format.raw/*43.64*/("""</td>
                        <td>&euro; """),_display_(/*44.37*/("%.2f".format(i.getItemTotal))),format.raw/*44.68*/("""</td>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getQuantity()),format.raw/*45.45*/("""</td>
                        <td><a href=""""),_display_(/*46.39*/routes/*46.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*46.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*47.39*/routes/*47.45*/.ShoppingCtrl.addOne(i.getId)),format.raw/*47.74*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*49.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*50.16*/("""
			"""),format.raw/*51.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*55.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*55.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*61.31*/routes/*61.37*/.ShoppingCtrl.emptyBasket()),format.raw/*61.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*67.31*/routes/*67.37*/.CustomerCtrl.payment(catId, filter)),format.raw/*67.73*/("""" class="btn btn-success btn-sm">
                    </span> Go To Payment</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*77.24*/("""{"""),format.raw/*77.25*/("""
		"""),format.raw/*78.3*/("""return confirm('Are you sure?');
	"""),format.raw/*79.2*/("""}"""),format.raw/*79.3*/("""
"""),format.raw/*80.1*/("""</script>
""")))}),format.raw/*81.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,catId,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,catId,filter) => apply(customer,user,categories,catId,filter)

  def ref: this.type = this

}


}

/**/
object basket extends basket_Scope0.basket
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 10:56:04 IST 2017
                  SOURCE: /home/wdd/Desktop/11-4-17/dsad/app/views/customer/basket.scala.html
                  HASH: 7a1b60bb4dcb453bd48d8b776b0f0eef30663831
                  MATRIX: 823->1|1140->123|1168->229|1195->230|1266->276|1330->332|1369->334|1399->337|1472->384|1513->416|1553->418|1586->424|1657->468|1671->473|1707->488|1740->494|1780->504|1812->509|2184->854|2225->886|2265->888|2314->909|2424->992|2487->1039|2527->1041|2576->1062|2637->1096|2647->1097|2687->1116|2749->1151|2759->1152|2808->1180|2848->1194|2858->1195|2900->1216|2969->1258|3017->1285|3086->1327|3138->1358|3200->1393|3210->1394|3245->1408|3316->1452|3331->1458|3384->1490|3513->1592|3528->1598|3578->1627|3719->1737|3790->1777|3821->1781|3998->1931|4070->1981|4277->2161|4292->2167|4340->2194|4662->2489|4677->2495|4734->2531|5024->2793|5053->2794|5083->2797|5144->2831|5172->2832|5200->2833|5241->2844
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|42->12|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|51->21|66->36|66->36|66->36|67->37|68->38|68->38|68->38|69->39|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|73->43|73->43|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|79->49|80->50|81->51|85->55|85->55|91->61|91->61|91->61|97->67|97->67|97->67|107->77|107->77|108->78|109->79|109->79|110->80|111->81
                  -- GENERATED --
              */
          