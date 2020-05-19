/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.Category
import org.openapitools.client.models.Tag

import com.squareup.moshi.Json
/**
 * A pet for sale in the pet store
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */

internal data class Pet (
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "photoUrls")
    val photoUrls: kotlin.Array<kotlin.String>,
    @Json(name = "id")
    val id: kotlin.Long? = null,
    @Json(name = "category")
    val category: Category? = null,
    @Json(name = "tags")
    val tags: kotlin.Array<Tag>? = null,
    /* pet status in the store */
    @Json(name = "status")
    val status: Pet.Status? = null
) {

    /**
    * pet status in the store
    * Values: available,pending,sold
    */
    
    internal enum class Status(val value: kotlin.String){
        @Json(name = "available") available("available"),
        @Json(name = "pending") pending("pending"),
        @Json(name = "sold") sold("sold");
    }
}

