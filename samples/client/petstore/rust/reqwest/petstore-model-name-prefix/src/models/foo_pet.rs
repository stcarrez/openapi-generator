/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// FooPet : A pet for sale in the pet store
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct FooPet {
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i64>,
    #[serde(rename = "category", skip_serializing_if = "Option::is_none")]
    pub category: Option<Box<models::FooCategory>>,
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "photoUrls")]
    pub photo_urls: Vec<String>,
    #[serde(rename = "tags", skip_serializing_if = "Option::is_none")]
    pub tags: Option<Vec<models::FooTag>>,
    /// pet status in the store
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<Status>,
}

impl FooPet {
    /// A pet for sale in the pet store
    pub fn new(name: String, photo_urls: Vec<String>) -> FooPet {
        FooPet {
            id: None,
            category: None,
            name,
            photo_urls,
            tags: None,
            status: None,
        }
    }
}
/// pet status in the store
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Status {
    #[serde(rename = "available")]
    Available,
    #[serde(rename = "pending")]
    Pending,
    #[serde(rename = "sold")]
    Sold,
}

impl Default for Status {
    fn default() -> Status {
        Self::Available
    }
}

