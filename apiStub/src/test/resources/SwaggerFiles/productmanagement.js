

/*
 *Added by Ashutosh  - getByProductID() , exports.addProduct to get json response and add a product to STATE
 *
*/

state.json = []
//state.cid || []

function getByProductID(productID) {
    
    var len = state.json.length;
    
    for (var i = 0; i < len; i++) {
        if (state.json[i].productID == productID) {
            return state.json[i];
        }
    }
   return { 'Error': 'ProductID not found . Perform --Delete , --POST , --GET in sequence for a productId=xxxx' };
    //return -1;
}

exports.addProduct = function(req, res){
    if (!req.is('application/json')) {
        return res.send(400, 'Invalid content type, expected application/json');
    }
    
    if (!state.json) {
        state.json = [];
    }
    
    if (getByProductID(req.body.productID) == -1) {
        return res.send(409, 'Product with that ID already exists');
    }
    
    // todo: could validate that body is a valid product
    state.json = [];
    state.json.push(req.body);
    //state.cid = [];
    //state.cid.push(req.headers.CorrelationId);
    res.type('application/json');
    res.status(200);
    res.json({
        "status": "ok",
        "corId": req.headers
    });
};


exports.deleteProduct = function(req, res) {
    if (getByProductID(req.params.productID) == -1) {
        return res.send(404, 'Product with that ID not found');
    }
    
    var i = 0;
    var len = state.json.length;
    for (i = 0; i < len; i++) {
        if (state.json[i].productID == req.params.productID) {
            break;
        }
    }
    
    state.json.splice(i, 1);
    
    res.type('application/json');
    res.status(200);
    res.json({
        "status": "ok"
    });
};

exports.deleteAllProducts = function(req, res){
    state.json=[];
    res.status(200);
    res.json({
        "status": "ok"
    });
};

/*
create responses 400, 404 , 500
*/

/*
 * GET /productmanagement/product/v1/products/{productID}
 *
 * Parameters (named path params accessible on req.params and query params on req.query):
 *
 * productStatus(type: string) - query parameter - Specifies if the product is in a state to be published from the ProductManagement service
 * productLanguage(type: string) - query parameter - Specifies the language of the data returned
 * asos-cid(type: string) - header parameter - Correlation ID (GUID) to aid correlation between API calls.
For more details please refer the latest version of ASOS REST guidelines
 */
exports.getProductmanagementProductV1Products = function(req, res){
    if (req.params.productID == '401') {
        res.status(401);
        res.json({
            message: 'you are not authorized.'
        });
    } else if (req.params.productID == '404') {
        res.status(404);
        res.json({
            message: 'Product not found.'
        });
    } else if (req.params.productID == '500') {
        res.status(500);
        res.json({
            message: 'Internal server error'
        });
    } else {
        res.status(200);
    
        // set response body and send
        res.type('json');
        //res.render('productmanagement_getProductmanagementProductV1Products');
        res.set('asos-cid', req.headers.CorrelationId);
        res.json(getByProductID(req.params.productID));
    }
};

/*
 * PARAMETERS /productmanagement/product/v1/products/{productID}
 *
 * Parameters (named path params accessible on req.params and query params on req.query):
 *
 */
exports.parametersProductmanagementProductV1Products = function(req, res) {
	res.status(200);

	// set response body and send
	res.json({});
};

/*
 * GET /productmanagement/product/v1/products
 *
 * Parameters (named path params accessible on req.params and query params on req.query):
 *
 * productIDs(type: array) - query parameter - List of Product level ID's
 * productLanguage(type: string) - query parameter - Specifies the language of the data requested
 * colourwayIDs(type: array) - query parameter - A list of Colourway level ID's
 * variantIDs(type: array) - query parameter - A list of Variant level ID's
 * status(type: string) - query parameter - Specifies the status value which needs to be applied to the product, colourway and variant. Maps to productStatus, colourwayStatus and variantStatus
 * asos-cid(type: string) - header parameter - Correlation ID (GUID) to aid correlation between API calls
 */
exports.getProductmanagementProductV1Products2 = function(req, res) {
	res.status(200);

	// set response body and send
	res.json({});
};

/*
 * GET /productmanagement/product/v1/shootOps/{colourwayID}
 *
 * Parameters (named path params accessible on req.params and query params on req.query):
 *
 * asos-cid(type: string) - header parameter - Correlation ID (GUID) to aid correlation between API calls
 */
exports.getProductmanagementProductV1Shootops = function(req, res) {
	res.status(200);

	// set response body and send
	res.type('json');
	res.render('productmanagement_getProductmanagementProductV1Shootops');
};

/*
 * PARAMETERS /productmanagement/product/v1/shootOps/{colourwayID}
 *
 * Parameters (named path params accessible on req.params and query params on req.query):
 *
 */
exports.parametersProductmanagementProductV1Shootops = function(req, res) {
	res.status(200);

	// set response body and send
	res.json({});
};

/*
 * GET /productmanagement/product/v1/productGroups/{groupID}
 *
 * Parameters (named path params accessible on req.params and query params on req.query):
 *
 * asos-cid(type: string) - header parameter - Correlation ID (GUID) to aid correlation between API calls
 */
exports.getProductmanagementProductV1Productgroups = function(req, res) {
	res.status(200);

	// set response body and send
	res.json({});
};

/*
 * PARAMETERS /productmanagement/product/v1/productGroups/{groupID}
 *
 * Parameters (named path params accessible on req.params and query params on req.query):
 *
 */
exports.parametersProductmanagementProductV1Productgroups = function(req, res) {
	res.status(200);

	// set response body and send
	res.json({});
};

/*
 * GET /productmanagement/product/v1/productLookUp
 *
 * Parameters (named path params accessible on req.params and query params on req.query):
 *
 * productID(type: array) - query parameter - Unique Identifier at Product Level - PIM STEP ID
 * retailStyleID(type: array) - query parameter - The retail [style level] ID for the product
 * legacyStyleID(type: array) - query parameter - Existing Merret Style ID
 * colourwayID(type: array) - query parameter - Unique Identifier at Colourway Level - PIM STEP ID
 * retailOptionID(type: array) - query parameter - This is Unique Identifier at Option Level for TGR
 * legacyOptionID(type: array) - query parameter - This is the combination of [style level] Merret ID and ColourCode and is used for sample scan in fashion gps
 * variantID(type: array) - query parameter - Unique Identifier at Variant Level - PIM STEP ID
 * retailSKUID(type: array) - query parameter - This is Unique Identifier at SKU Level for TGR
 * legacySKUID(type: array) - query parameter - This is the Merret ID at a SKU level
 * asos-cid(type: string) - header parameter - Correlation ID (GUID) to aid correlation between API calls
 */
exports.getProductmanagementProductV1Productlookup = function(req, res) {
	res.status(200);

	// set response body and send
	res.type('json');
	res.render('productmanagement_getProductmanagementProductV1Productlookup');
};

exports.getProductByProdId = function(req, res) {
	res.status(200);

	// set response body and send
	res.type('json');
	res.render('productmanagement_getProductmanagementProductV1Products');
};