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

**F - Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:**

- _The “Buy Now” button must be next to the buttons that update and delete products._
- _The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts._
- _Display a message that indicates the success or failure of a purchase._

***

Added empty 'Buy Now' button on to the main screen. Will work on the onCLick logic soon.

- mainscreen.html, line 91

With the "buyproduct" href I added to the Buy Now button, I created a new GetMapping object on the existing "AddProductController" to handle decrementing the inventory count of the product being purchased.

- AddProductController, lines 177 - 197

Added "if-else" logic to the "AddProductController" to check if the inventory had 1 product or more. If the product has 1 or more items in inventory, the  product inventory will decerement by 1, and will call the "confirmationbuyproduct.html" file I created. If the else clause is triggered, then the object will call the "errorbuyproduct.html" file.

- AddProductController, lines 182 - 191
- confirmationbuyproduct.html, lines 1 - 21
- errorbuyproduct.html, lines 1 - 21

**G - Modify the parts to track maximum and minimum inventory by doing the following:**

- _Add additional fields to the part entity for maximum and minimum inventory._
- _Modify the sample inventory to include the maximum and minimum fields._
- _Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values._
- _Rename the file the persistent storage is saved to._
- _Modify the code to enforce that the inventory is between or at the minimum and maximum value._

***

Added "MinInv" and "MaxInv" integers to the "Part.java" domain file.

- Part.java, Lines 30 - 33

Added minInv and maxInv to the Part objects.

- Part.java, Lines 43 - 58

Added get/set functions for handling Min and Max Inventory values.

- Part.java, Lines 92 - 106

Added get/set functions within the sample inventory for parts in BootStrapData file.

- BootStrapData.java, Lines 51 - 96

Updated H2 database name to "dapperware-inventory"

- application.properties, Line 6

Added text input fields for the Min Inventory and Max Inventory on the inhouse part form.

- InhousePartForm.html, Lines 24 - 28

Added text input fields for the Min Inventory and Max Inventory on the outsourced part form.

- OutsourcedPartForm.html, Lines 25 - 29

Added Minimum Inventory and Maximum Inventory entities on the mainscreen table. 

- Mainscreen.html, Lines 44 - 45, 54 - 55

Added check within "AddInhousePartController" to ensure the user input "inv" is between user input "minInv" and "maxInv"

- AddInhousePartController.java, Lines 46 - 52

Added check within "AddOutsourcedPartController" to ensure the user input "inv" is between user input "minInv" and "maxInv"

- AddOutsourcedPartController.java, Lines 46 - 52

**H - Add validation for between or at the maximum and minimum fields. The validation must include the following:**

- _Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts._
- _Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum._
- _Display error messages when adding and updating parts if the inventory is greater than the maximum._

***

Added check within "AddInhousePartController" to ensure the user input "inv" is between user input "minInv" and "maxInv" when updating.

- AddInhousePartController.java, Lines 46 - 52

Added check within "AddOutsourcedPartController" to ensure the user input "inv" is between user input "minInv" and "maxInv" when updating.

- AddOutsourcedPartController.java, Lines 46 - 52

Updated "EnufPartsValidator.java" to return false if the part inventory minus the products associated part inventory is less than the min or greater than the maximum inventory set.

- EnufPartsValidator.java, line 36

**I - Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.**

***

Added tests for get/set minimum and maximum inventory on the PartTest class in the test package.

- PartTest.java, Lines 104 - 138

**J - Remove the class files for any unused validators in order to clean your code.**

***

Deleted unused Validators.

- DeletePartValidator.java


