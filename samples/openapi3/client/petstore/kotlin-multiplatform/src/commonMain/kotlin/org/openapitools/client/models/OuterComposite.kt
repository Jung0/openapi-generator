/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer
/**
 * 
 * @param myNumber 
 * @param myString 
 * @param myBoolean 
 */
@Serializable
data class OuterComposite (
    @SerialName(value = "my_number") val myNumber: kotlin.Double? = null,
    @SerialName(value = "my_string") val myString: kotlin.String? = null,
    @SerialName(value = "my_boolean") val myBoolean: kotlin.Boolean? = null
) 



