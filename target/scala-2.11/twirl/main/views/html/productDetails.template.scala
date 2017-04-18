
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object productDetails_Scope0 {
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

     object productDetails_Scope1 {
import helper._

class productDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[List[models.Category],models.users.User,Long,String,models.Product,List[models.productsAdditions.Comment],Form[productsAdditions.Comment],models.Size,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(categories: List[models.Category], user: models.users.User, catId: Long, filter: String, prod: models.Product, cList: List[models.productsAdditions.Comment], commentForm: Form[productsAdditions.Comment], size: models.Size):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.225*/("""
"""),_display_(/*3.2*/main("productDetails", user,  categories, catId, filter)/*3.58*/ {_display_(Seq[Any](format.raw/*3.60*/("""
				"""),format.raw/*4.5*/("""<div class="col-sm-12 padding-right">
					<div class="product-details"><!--product-details-->
						<div class="col-sm-5">
							<div class="view-product">
								<img src="/assets/images/productImages/"""),_display_(/*8.49*/(prod.getId)),format.raw/*8.61*/(""".jpg" alt="" />
								
							</div>
							<div id="similar-product" class="carousel slide" data-ride="carousel">
								
								  

								  <!-- Controls -->
								  <a class="left item-control" href="#similar-product" data-slide="prev">
									<i class="fa fa-angle-left"></i>
								  </a>
								  <a class="right item-control" href="#similar-product" data-slide="next">
									<i class="fa fa-angle-right"></i>
								  </a>
							</div>
							

						</div>
						<div class="col-sm-7">
							<div class="product-information"><!--/product-information-->
								
								<h2>"""),_display_(/*29.14*/prod/*29.18*/.getName),format.raw/*29.26*/("""</h2>
								
								
								<span>
									<span>€"""),_display_(/*33.18*/prod/*33.22*/.getPrice),format.raw/*33.31*/("""</span>
									
									<button type="button" class="btn btn-fefault cart">
										<a href=""""),_display_(/*36.21*/routes/*36.27*/.ShoppingCtrl.addToBasket(prod.getId)),format.raw/*36.64*/("""" ><i class="fa fa-shopping-cart"></i>Add to cart</a>
									</button>
								</span>
								
								<div class="form-group ">
  								<label for="sel1">Size:</label>
								  """),_display_(/*42.12*/for((value, sizeName) <- Size.options) yield /*42.50*/ {_display_(Seq[Any](format.raw/*42.52*/("""
            							    """),format.raw/*43.24*/("""<input type="checkbox" name="Sizes" value=""""),_display_(/*43.68*/value),format.raw/*43.73*/("""" />"""),_display_(/*43.78*/sizeName),format.raw/*43.86*/("""<br>        
        							  """)))}),format.raw/*44.19*/("""
								"""),format.raw/*45.9*/("""</div>
								<p><b>Availability:</b> In Stock</p>
								<p><b>Condition:</b> New</p>
								<p><b>Brand:</b> A&JS</p>
								
							</div><!--/product-information-->
						</div>
					</div><!--/product-details-->

						<div class="tab-pane fade active in" id="reviews" >
							<div class="col-sm-12">
								"""),_display_(/*56.10*/for(c <- cList) yield /*56.25*/ {_display_(Seq[Any](format.raw/*56.27*/("""
									"""),format.raw/*57.10*/("""<div class="product-information">
									<ul>
										<li><a href=""><i class="fa fa-user"></i>"""),_display_(/*59.53*/user/*59.57*/.getfName()),format.raw/*59.68*/("""</a></li>
										<li><a href=""><i class="fa fa-clock-o"></i>12:41 PM</a></li>
										<li><a href=""><i class="fa fa-calendar-o"></i>31 DEC 2014</a></li>
									</ul>
									<p> """),_display_(/*63.15*/c/*63.16*/.getContent),format.raw/*63.27*/("""</p>
									</div>
								""")))}),format.raw/*65.10*/("""
								"""),format.raw/*66.9*/("""<p><b>Write Your Review</b></p>



									"""),_display_(/*70.11*/form(action = routes.CustomerCtrl.comment(catId, filter, prod.getId()), 'class -> "form-horizontal", 'role -> "form")/*70.128*/ {_display_(Seq[Any](format.raw/*70.130*/("""
									"""),_display_(/*71.11*/inputText(commentForm("content"), '_label -> "Write your comment here", 'class -> "form-control")),format.raw/*71.108*/("""
										"""),format.raw/*72.11*/("""<input type="submit" value="Add comment" class="btn btn-default pull-right">
									""")))}),format.raw/*73.11*/("""


							"""),format.raw/*76.8*/("""</div>
						</div>
					
					
				</div>
""")))}),format.raw/*81.2*/("""
"""))
      }
    }
  }

  def render(categories:List[models.Category],user:models.users.User,catId:Long,filter:String,prod:models.Product,cList:List[models.productsAdditions.Comment],commentForm:Form[productsAdditions.Comment],size:models.Size): play.twirl.api.HtmlFormat.Appendable = apply(categories,user,catId,filter,prod,cList,commentForm,size)

  def f:((List[models.Category],models.users.User,Long,String,models.Product,List[models.productsAdditions.Comment],Form[productsAdditions.Comment],models.Size) => play.twirl.api.HtmlFormat.Appendable) = (categories,user,catId,filter,prod,cList,commentForm,size) => apply(categories,user,catId,filter,prod,cList,commentForm,size)

  def ref: this.type = this

}


}
}

/**/
object productDetails extends productDetails_Scope0.productDetails_Scope1.productDetails
              /*
                  -- GENERATED --
                  DATE: Fri Apr 14 14:47:58 IST 2017
                  SOURCE: /home/wdd/Desktop/14-04-17/14-04-17/app/views/productDetails.scala.html
                  HASH: 11600ffb195936e91984580c63c2e1a58a36b5f2
                  MATRIX: 959->18|1278->241|1305->243|1369->299|1408->301|1439->306|1671->512|1703->524|2331->1125|2344->1129|2373->1137|2456->1193|2469->1197|2499->1206|2625->1305|2640->1311|2698->1348|2910->1533|2964->1571|3004->1573|3056->1597|3127->1641|3153->1646|3185->1651|3214->1659|3276->1690|3312->1699|3659->2019|3690->2034|3730->2036|3768->2046|3895->2146|3908->2150|3940->2161|4156->2350|4166->2351|4198->2362|4259->2392|4295->2401|4367->2446|4494->2563|4535->2565|4573->2576|4692->2673|4731->2684|4849->2771|4886->2781|4960->2825
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|41->8|41->8|62->29|62->29|62->29|66->33|66->33|66->33|69->36|69->36|69->36|75->42|75->42|75->42|76->43|76->43|76->43|76->43|76->43|77->44|78->45|89->56|89->56|89->56|90->57|92->59|92->59|92->59|96->63|96->63|96->63|98->65|99->66|103->70|103->70|103->70|104->71|104->71|105->72|106->73|109->76|114->81
                  -- GENERATED --
              */
          