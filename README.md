# **Shop Inventory Management - Collin Dapper**

**C -  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.**

_Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required._

***

Changed the title and name of the shop to "DapperWare Solutions, LLC".
- mainscreen.html, line 14 and line 19

Changed "Parts" to "Computer Parts".

- mainscreen.html, line 21

Changed "Products" to "Computer Builds".

- mainscreen.html, line 53



**D - Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.**

***

Created "aboutscreen.html" in directory "src < main < resources < templates", to house the User displayed content.

Created "AboutScreenController.java" in directory "src < main < java < com.example.demo < controllers" to handle the About link from within mainscreen.html and send user to the aboutscreen.html, and vice versa.

Added "About Us" link to the Main screen.

- mainscreen.html, line 21

Added "Main Screen" link to the About Us screen.

- aboutscreen.html, line 21

Added section "Who We Are", "What We Do", "Our Mission", and "Why Choose Us?" to the About Us page.

- aboutscreen.html, line 28


**E - Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.**


_Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part._

***

Made sure to add "import com.example.demo.domain.Product" to be able to create a product.

- BootStrapData.java, line 3

Created Outsourced parts and products list within a logical IF statement that checks the count of "partRepository" and "productRepository" to ensure they are both at ZERO so that duplicate items are not created.

- BootStrapData.java, line 52

