extends DemoApiBee
class_name DemoPetApi

# THIS FILE WAS AUTOMATICALLY GENERATED by the OpenAPI Generator project.
# For more information on how to customize templates, see:
# https://openapi-generator.tech
# https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources/gdscript
# The OpenAPI Generator Community, © Public Domain, 2022

# API DemoPetApi
# Instantiate this object and use it to make requests to the API.

func _bzz_get_api_name() -> String:
	return "DemoPetApi"


# Operation addPet → POST /pet
# Add a new pet to the store
func add_pet(
	# demoPetModel: DemoPetModel
	# Pet object that needs to be added to the store
	demoPetModel: DemoPetModel,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
):

	# Convert the String HTTP method to a Constant Godot understands
	var bzz_method := self._bzz_convert_http_method("POST")

	# Compute the URL path to the API resource
	var bzz_path := "/v2/pet"

	# Collect the headers
	var bzz_headers := Dictionary()
	var bzz_mimes_consumable_by_server := ['application/json', 'application/xml']
	var bzz_found_producible_mime := false
	for bzz_mime in BZZ_PRODUCIBLE_CONTENT_TYPES:
		if bzz_mime in bzz_mimes_consumable_by_server:
			bzz_headers["Content-Type"] = bzz_mime
			bzz_found_producible_mime = true
			break
	if not bzz_found_producible_mime:
		var error := DemoApiError.new()
		error.identifier = "add_pet.headers.content_type"
		error.message = "That endpoint only accepts %s as content type(s) and none are supported by this client."
		on_failure.call(error)
		return
	var bzz_mimes_produced_by_server := ['application/xml', 'application/json']
	for bzz_mime in BZZ_CONSUMABLE_CONTENT_TYPES:
		if bzz_mime in bzz_mimes_produced_by_server:
			bzz_headers["Accept"] = bzz_mime
			break

	# Collect the query parameters
	# Note: we do not support multiple values for a single param (for now), nor arrays
	var bzz_query := Dictionary()

	var bzz_body = null
	bzz_body = demoPetModel

	self._bzz_request(
		bzz_method, bzz_path, bzz_headers, bzz_query, bzz_body,
		func(bzz_response):
			bzz_response.data = DemoPetModel.bzz_denormalize_single(bzz_response.data)
			on_success.call(bzz_response)
			,
		func(bzz_error):
			on_failure.call(bzz_error)
			,  # ざわ‥
	)


func add_pet_threaded(
	# demoPetModel: DemoPetModel
	# Pet object that needs to be added to the store
	demoPetModel: DemoPetModel,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
) -> Thread:
	var bzz_thread := Thread.new()
	var bzz_callable := Callable(self, "add_pet")
	bzz_callable.bind(
		demoPetModel,
		on_success,
		on_failure,
	)
	bzz_thread.start(bzz_callable)
	return bzz_thread


# Operation deletePet → DELETE /pet/{petId}
# Deletes a pet
func delete_pet(
	# petId: float   Eg: 789
	# Pet id to delete
	petId: float,
	# apiKey: String = ""   Eg: apiKey_example
	apiKey = "",
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
):

	# Convert the String HTTP method to a Constant Godot understands
	var bzz_method := self._bzz_convert_http_method("DELETE")

	# Compute the URL path to the API resource
	var bzz_path := "/v2/pet/{petId}".replace("{" + "petId" + "}", _bzz_urlize_path_param(petId))

	# Collect the headers
	var bzz_headers := Dictionary()
	bzz_headers["api_key"] = apiKey

	# Collect the query parameters
	# Note: we do not support multiple values for a single param (for now), nor arrays
	var bzz_query := Dictionary()

	var bzz_body = null

	self._bzz_request(
		bzz_method, bzz_path, bzz_headers, bzz_query, bzz_body,
		func(bzz_response):
			on_success.call(bzz_response)
			,
		func(bzz_error):
			on_failure.call(bzz_error)
			,  # ざわ‥
	)


func delete_pet_threaded(
	# petId: float   Eg: 789
	# Pet id to delete
	petId: float,
	# apiKey: String = ""   Eg: apiKey_example
	apiKey = "",
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
) -> Thread:
	var bzz_thread := Thread.new()
	var bzz_callable := Callable(self, "delete_pet")
	bzz_callable.bind(
		petId,
		apiKey,
		on_success,
		on_failure,
	)
	bzz_thread.start(bzz_callable)
	return bzz_thread


# Operation findPetsByStatus → GET /pet/findByStatus
# Finds Pets by status
#
# Multiple status values can be provided with comma separated strings
func find_pets_by_status(
	# status: Array
	# Status values that need to be considered for filter
	status: Array,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
):

	# Convert the String HTTP method to a Constant Godot understands
	var bzz_method := self._bzz_convert_http_method("GET")

	# Compute the URL path to the API resource
	var bzz_path := "/v2/pet/findByStatus"

	# Collect the headers
	var bzz_headers := Dictionary()
	var bzz_mimes_produced_by_server := ['application/xml', 'application/json']
	for bzz_mime in BZZ_CONSUMABLE_CONTENT_TYPES:
		if bzz_mime in bzz_mimes_produced_by_server:
			bzz_headers["Accept"] = bzz_mime
			break

	# Collect the query parameters
	# Note: we do not support multiple values for a single param (for now), nor arrays
	var bzz_query := Dictionary()
	bzz_query["status"] = status

	var bzz_body = null

	self._bzz_request(
		bzz_method, bzz_path, bzz_headers, bzz_query, bzz_body,
		func(bzz_response):
			bzz_response.data = DemoPetModel.bzz_denormalize_multiple(bzz_response.data)
			on_success.call(bzz_response)
			,
		func(bzz_error):
			on_failure.call(bzz_error)
			,  # ざわ‥
	)


func find_pets_by_status_threaded(
	# status: Array
	# Status values that need to be considered for filter
	status: Array,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
) -> Thread:
	var bzz_thread := Thread.new()
	var bzz_callable := Callable(self, "find_pets_by_status")
	bzz_callable.bind(
		status,
		on_success,
		on_failure,
	)
	bzz_thread.start(bzz_callable)
	return bzz_thread


# /!.  DEPRECATED
# Operation findPetsByTags → GET /pet/findByTags
# Finds Pets by tags
#
# Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
func find_pets_by_tags(
	# tags: Array
	# Tags to filter by
	tags: Array,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
):
	push_warning("Usage of `find_pets_by_tags()` is deprecated.")

	# Convert the String HTTP method to a Constant Godot understands
	var bzz_method := self._bzz_convert_http_method("GET")

	# Compute the URL path to the API resource
	var bzz_path := "/v2/pet/findByTags"

	# Collect the headers
	var bzz_headers := Dictionary()
	var bzz_mimes_produced_by_server := ['application/xml', 'application/json']
	for bzz_mime in BZZ_CONSUMABLE_CONTENT_TYPES:
		if bzz_mime in bzz_mimes_produced_by_server:
			bzz_headers["Accept"] = bzz_mime
			break

	# Collect the query parameters
	# Note: we do not support multiple values for a single param (for now), nor arrays
	var bzz_query := Dictionary()
	bzz_query["tags"] = tags

	var bzz_body = null

	self._bzz_request(
		bzz_method, bzz_path, bzz_headers, bzz_query, bzz_body,
		func(bzz_response):
			bzz_response.data = DemoPetModel.bzz_denormalize_multiple(bzz_response.data)
			on_success.call(bzz_response)
			,
		func(bzz_error):
			on_failure.call(bzz_error)
			,  # ざわ‥
	)


func find_pets_by_tags_threaded(
	# tags: Array
	# Tags to filter by
	tags: Array,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
) -> Thread:
	var bzz_thread := Thread.new()
	var bzz_callable := Callable(self, "find_pets_by_tags")
	bzz_callable.bind(
		tags,
		on_success,
		on_failure,
	)
	bzz_thread.start(bzz_callable)
	return bzz_thread


# Operation getPetById → GET /pet/{petId}
# Find pet by ID
#
# Returns a single pet
func get_pet_by_id(
	# petId: float   Eg: 789
	# ID of pet to return
	petId: float,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
):

	# Convert the String HTTP method to a Constant Godot understands
	var bzz_method := self._bzz_convert_http_method("GET")

	# Compute the URL path to the API resource
	var bzz_path := "/v2/pet/{petId}".replace("{" + "petId" + "}", _bzz_urlize_path_param(petId))

	# Collect the headers
	var bzz_headers := Dictionary()
	var bzz_mimes_produced_by_server := ['application/xml', 'application/json']
	for bzz_mime in BZZ_CONSUMABLE_CONTENT_TYPES:
		if bzz_mime in bzz_mimes_produced_by_server:
			bzz_headers["Accept"] = bzz_mime
			break

	# Collect the query parameters
	# Note: we do not support multiple values for a single param (for now), nor arrays
	var bzz_query := Dictionary()

	var bzz_body = null

	self._bzz_request(
		bzz_method, bzz_path, bzz_headers, bzz_query, bzz_body,
		func(bzz_response):
			bzz_response.data = DemoPetModel.bzz_denormalize_single(bzz_response.data)
			on_success.call(bzz_response)
			,
		func(bzz_error):
			on_failure.call(bzz_error)
			,  # ざわ‥
	)


func get_pet_by_id_threaded(
	# petId: float   Eg: 789
	# ID of pet to return
	petId: float,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
) -> Thread:
	var bzz_thread := Thread.new()
	var bzz_callable := Callable(self, "get_pet_by_id")
	bzz_callable.bind(
		petId,
		on_success,
		on_failure,
	)
	bzz_thread.start(bzz_callable)
	return bzz_thread


# Operation updatePet → PUT /pet
# Update an existing pet
func update_pet(
	# demoPetModel: DemoPetModel
	# Pet object that needs to be added to the store
	demoPetModel: DemoPetModel,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
):

	# Convert the String HTTP method to a Constant Godot understands
	var bzz_method := self._bzz_convert_http_method("PUT")

	# Compute the URL path to the API resource
	var bzz_path := "/v2/pet"

	# Collect the headers
	var bzz_headers := Dictionary()
	var bzz_mimes_consumable_by_server := ['application/json', 'application/xml']
	var bzz_found_producible_mime := false
	for bzz_mime in BZZ_PRODUCIBLE_CONTENT_TYPES:
		if bzz_mime in bzz_mimes_consumable_by_server:
			bzz_headers["Content-Type"] = bzz_mime
			bzz_found_producible_mime = true
			break
	if not bzz_found_producible_mime:
		var error := DemoApiError.new()
		error.identifier = "update_pet.headers.content_type"
		error.message = "That endpoint only accepts %s as content type(s) and none are supported by this client."
		on_failure.call(error)
		return
	var bzz_mimes_produced_by_server := ['application/xml', 'application/json']
	for bzz_mime in BZZ_CONSUMABLE_CONTENT_TYPES:
		if bzz_mime in bzz_mimes_produced_by_server:
			bzz_headers["Accept"] = bzz_mime
			break

	# Collect the query parameters
	# Note: we do not support multiple values for a single param (for now), nor arrays
	var bzz_query := Dictionary()

	var bzz_body = null
	bzz_body = demoPetModel

	self._bzz_request(
		bzz_method, bzz_path, bzz_headers, bzz_query, bzz_body,
		func(bzz_response):
			bzz_response.data = DemoPetModel.bzz_denormalize_single(bzz_response.data)
			on_success.call(bzz_response)
			,
		func(bzz_error):
			on_failure.call(bzz_error)
			,  # ざわ‥
	)


func update_pet_threaded(
	# demoPetModel: DemoPetModel
	# Pet object that needs to be added to the store
	demoPetModel: DemoPetModel,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
) -> Thread:
	var bzz_thread := Thread.new()
	var bzz_callable := Callable(self, "update_pet")
	bzz_callable.bind(
		demoPetModel,
		on_success,
		on_failure,
	)
	bzz_thread.start(bzz_callable)
	return bzz_thread


# Operation updatePetWithForm → POST /pet/{petId}
# Updates a pet in the store with form data
func update_pet_with_form(
	# petId: float   Eg: 789
	# ID of pet that needs to be updated
	petId: float,
	# name: String = ""   Eg: name_example
	# Updated name of the pet
	name = "",
	# status: String = ""   Eg: status_example
	# Updated status of the pet
	status = "",
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
):

	# Convert the String HTTP method to a Constant Godot understands
	var bzz_method := self._bzz_convert_http_method("POST")

	# Compute the URL path to the API resource
	var bzz_path := "/v2/pet/{petId}".replace("{" + "petId" + "}", _bzz_urlize_path_param(petId))

	# Collect the headers
	var bzz_headers := Dictionary()
	var bzz_mimes_consumable_by_server := ['application/x-www-form-urlencoded']
	var bzz_found_producible_mime := false
	for bzz_mime in BZZ_PRODUCIBLE_CONTENT_TYPES:
		if bzz_mime in bzz_mimes_consumable_by_server:
			bzz_headers["Content-Type"] = bzz_mime
			bzz_found_producible_mime = true
			break
	if not bzz_found_producible_mime:
		var error := DemoApiError.new()
		error.identifier = "update_pet_with_form.headers.content_type"
		error.message = "That endpoint only accepts %s as content type(s) and none are supported by this client."
		on_failure.call(error)
		return

	# Collect the query parameters
	# Note: we do not support multiple values for a single param (for now), nor arrays
	var bzz_query := Dictionary()

	var bzz_body = null
	bzz_body = Dictionary()
	bzz_body["name"] = name
	bzz_body["status"] = status

	self._bzz_request(
		bzz_method, bzz_path, bzz_headers, bzz_query, bzz_body,
		func(bzz_response):
			on_success.call(bzz_response)
			,
		func(bzz_error):
			on_failure.call(bzz_error)
			,  # ざわ‥
	)


func update_pet_with_form_threaded(
	# petId: float   Eg: 789
	# ID of pet that needs to be updated
	petId: float,
	# name: String = ""   Eg: name_example
	# Updated name of the pet
	name = "",
	# status: String = ""   Eg: status_example
	# Updated status of the pet
	status = "",
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
) -> Thread:
	var bzz_thread := Thread.new()
	var bzz_callable := Callable(self, "update_pet_with_form")
	bzz_callable.bind(
		petId,
		name,
		status,
		on_success,
		on_failure,
	)
	bzz_thread.start(bzz_callable)
	return bzz_thread


# Operation uploadFile → POST /pet/{petId}/uploadImage
# uploads an image
func upload_file(
	# petId: float   Eg: 789
	# ID of pet to update
	petId: float,
	# additionalMetadata: String = ""   Eg: additionalMetadata_example
	# Additional data to pass to server
	additionalMetadata = "",
	# file: String   Eg: BINARY_DATA_HERE
	# file to upload
	file = null,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
):

	# Convert the String HTTP method to a Constant Godot understands
	var bzz_method := self._bzz_convert_http_method("POST")

	# Compute the URL path to the API resource
	var bzz_path := "/v2/pet/{petId}/uploadImage".replace("{" + "petId" + "}", _bzz_urlize_path_param(petId))

	# Collect the headers
	var bzz_headers := Dictionary()
	var bzz_mimes_consumable_by_server := ['multipart/form-data']
	var bzz_found_producible_mime := false
	for bzz_mime in BZZ_PRODUCIBLE_CONTENT_TYPES:
		if bzz_mime in bzz_mimes_consumable_by_server:
			bzz_headers["Content-Type"] = bzz_mime
			bzz_found_producible_mime = true
			break
	if not bzz_found_producible_mime:
		var error := DemoApiError.new()
		error.identifier = "upload_file.headers.content_type"
		error.message = "That endpoint only accepts %s as content type(s) and none are supported by this client."
		on_failure.call(error)
		return
	var bzz_mimes_produced_by_server := ['application/json']
	for bzz_mime in BZZ_CONSUMABLE_CONTENT_TYPES:
		if bzz_mime in bzz_mimes_produced_by_server:
			bzz_headers["Accept"] = bzz_mime
			break

	# Collect the query parameters
	# Note: we do not support multiple values for a single param (for now), nor arrays
	var bzz_query := Dictionary()

	var bzz_body = null
	bzz_body = Dictionary()
	bzz_body["additionalMetadata"] = additionalMetadata
	bzz_body["file"] = file

	self._bzz_request(
		bzz_method, bzz_path, bzz_headers, bzz_query, bzz_body,
		func(bzz_response):
			bzz_response.data = DemoApiResponseModel.bzz_denormalize_single(bzz_response.data)
			on_success.call(bzz_response)
			,
		func(bzz_error):
			on_failure.call(bzz_error)
			,  # ざわ‥
	)


func upload_file_threaded(
	# petId: float   Eg: 789
	# ID of pet to update
	petId: float,
	# additionalMetadata: String = ""   Eg: additionalMetadata_example
	# Additional data to pass to server
	additionalMetadata = "",
	# file: String   Eg: BINARY_DATA_HERE
	# file to upload
	file = null,
	on_success: Callable = Callable(),  # func(response: DemoApiResponse)
	on_failure: Callable = Callable(),  # func(error: DemoApiError)
) -> Thread:
	var bzz_thread := Thread.new()
	var bzz_callable := Callable(self, "upload_file")
	bzz_callable.bind(
		petId,
		additionalMetadata,
		file,
		on_success,
		on_failure,
	)
	bzz_thread.start(bzz_callable)
	return bzz_thread


