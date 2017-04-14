
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

class productDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[List[models.Category],models.users.User,Long,String,models.Product,List[models.productsAdditions.Comment],Form[productsAdditions.Comment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(categories: List[models.Category], user: models.users.User, catId: Long, filter: String, prod: models.Product, cList: List[models.productsAdditions.Comment], commentForm: Form[productsAdditions.Comment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.206*/("""
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
								  <select class="form-control" id="sel1">
								    <option>XS</option>
								    <option>S</option>
								    <option>M</option>
								    <option>L</option>
								    <option>XL</option>
								    <option>XXL</option>
								    <option>XXXL</option>
								  </select>
								</div>
								<p><b>Availability:</b> In Stock</p>
								<p><b>Condition:</b> New</p>
								<p><b>Brand:</b> A&JS</p>
								
							</div><!--/product-information-->
						</div>
					</div><!--/product-details-->

						<div class="tab-pane fade active in" id="reviews" >
							<div class="col-sm-12">
								"""),_display_(/*62.10*/for(c <- cList) yield /*62.25*/ {_display_(Seq[Any](format.raw/*62.27*/("""
									"""),format.raw/*63.10*/("""<div class="product-information">
									<ul>
										<li><a href=""><i class="fa fa-user"></i>"""),_display_(/*65.53*/user/*65.57*/.getfName()),format.raw/*65.68*/("""</a></li>
										<li><a href=""><i class="fa fa-clock-o"></i>12:41 PM</a></li>
										<li><a href=""><i class="fa fa-calendar-o"></i>31 DEC 2014</a></li>
									</ul>
									<p> """),_display_(/*69.15*/c/*69.16*/.getContent),format.raw/*69.27*/("""</p>
									</div>
								""")))}),format.raw/*71.10*/("""
								"""),format.raw/*72.9*/("""<p><b>Write Your Review</b></p>



									"""),_display_(/*76.11*/form(action = routes.CustomerCtrl.comment(catId, filter, prod.getId()), 'class -> "form-horizontal", 'role -> "form")/*76.128*/ {_display_(Seq[Any](format.raw/*76.130*/("""
									"""),_display_(/*77.11*/inputText(commentForm("content"), '_label -> "Write your comment here", 'class -> "form-control")),format.raw/*77.108*/("""
										"""),format.raw/*78.11*/("""<input type="submit" value="Add comment" class="btn btn-default pull-right">
									""")))}),format.raw/*79.11*/("""


							"""),format.raw/*82.8*/("""</div>
						</div>
					
					
				</div>
""")))}))
      }
    }
  }

  def render(categories:List[models.Category],user:models.users.User,catId:Long,filter:String,prod:models.Product,cList:List[models.productsAdditions.Comment],commentForm:Form[productsAdditions.Comment]): play.twirl.api.HtmlFormat.Appendable = apply(categories,user,catId,filter,prod,cList,commentForm)

  def f:((List[models.Category],models.users.User,Long,String,models.Product,List[models.productsAdditions.Comment],Form[productsAdditions.Comment]) => play.twirl.api.HtmlFormat.Appendable) = (categories,user,catId,filter,prod,cList,commentForm) => apply(categories,user,catId,filter,prod,cList,commentForm)

  def ref: this.type = this

}


}
}

/**/
object productDetails extends productDetails_Scope0.productDetails_Scope1.productDetails
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 10:22:22 IST 2017
                  SOURCE: /home/wdd/Desktop/11-4-17/dsad/app/views/productDetails.scala.html
                  HASH: db9c4e836ce929374a3103465ed9854cab96ac08
                  MATRIX: 947->18|1247->222|1274->224|1338->280|1377->282|1408->287|1640->493|1672->505|2300->1106|2313->1110|2342->1118|2425->1174|2438->1178|2468->1187|2594->1286|2609->1292|2667->1329|3490->2125|3521->2140|3561->2142|3599->2152|3726->2252|3739->2256|3771->2267|3987->2456|3997->2457|4029->2468|4090->2498|4126->2507|4198->2552|4325->2669|4366->2671|4404->2682|4523->2779|4562->2790|4680->2877|4717->2887
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|41->8|41->8|62->29|62->29|62->29|66->33|66->33|66->33|69->36|69->36|69->36|95->62|95->62|95->62|96->63|98->65|98->65|98->65|102->69|102->69|102->69|104->71|105->72|109->76|109->76|109->76|110->77|110->77|111->78|112->79|115->82
                  -- GENERATED --
              */
          