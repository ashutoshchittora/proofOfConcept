
/*
 * Product Management Enriched Product API
 *
 * This definition is to support working with the product management enriched product.
 */


var productmanagement = require("./routes/productmanagement.js")

/* Route definition styles:
 *
 *	define(path, method, function)
 *	soap(path, soapAction, function)
 *
 */
Sandbox.define("/productmanagement/product/v1/products/{productID}", "GET", productmanagement.getProductmanagementProductV1Products);
Sandbox.define("/productmanagement/product/v1/products/{productID}", "PARAMETERS", productmanagement.parametersProductmanagementProductV1Products);
Sandbox.define("/productmanagement/product/v1/products", "GET", productmanagement.getProductmanagementProductV1Products2);
Sandbox.define("/productmanagement/product/v1/shootOps/{colourwayID}", "GET", productmanagement.getProductmanagementProductV1Shootops);
Sandbox.define("/productmanagement/product/v1/shootOps/{colourwayID}", "PARAMETERS", productmanagement.parametersProductmanagementProductV1Shootops);
Sandbox.define("/productmanagement/product/v1/productGroups/{groupID}", "GET", productmanagement.getProductmanagementProductV1Productgroups);
Sandbox.define("/productmanagement/product/v1/productGroups/{groupID}", "PARAMETERS", productmanagement.parametersProductmanagementProductV1Productgroups);
Sandbox.define("/productmanagement/product/v1/productLookUp", "GET", productmanagement.getProductmanagementProductV1Productlookup);

/*
* Added below requests for addidng and deleting 
*/

Sandbox.define("/product", "POST", productmanagement.addProduct);
Sandbox.define("/product",'DELETE', productmanagement.deleteAllProducts);
Sandbox.define("/product/{productID}", "DELETE", productmanagement.deleteProduct);
Sandbox.define("/productmanagement/dev/{prodID}", "GET", productmanagement.getProductByProdId);
