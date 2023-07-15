# coding: utf-8

"""
    Echo Server API

    Echo Server API  # noqa: E501

    The version of the OpenAPI document: 0.1.0
    Contact: team@openapitools.org
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from typing import Optional
from pydantic import BaseModel, Field, StrictStr
from openapi_client.models.query import Query

class DataQuery(Query):
    """
    DataQuery
    """
    suffix: Optional[StrictStr] = Field(None, description="test suffix")
    text: Optional[StrictStr] = Field(None, description="Some text containing white spaces")
    var_date: Optional[datetime] = Field(None, alias="date", description="A date")
    __properties = ["id", "outcomes", "suffix", "text", "date"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> DataQuery:
        """Create an instance of DataQuery from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> DataQuery:
        """Create an instance of DataQuery from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return DataQuery.parse_obj(obj)

        _obj = DataQuery.parse_obj({
            "id": obj.get("id"),
            "outcomes": obj.get("outcomes"),
            "suffix": obj.get("suffix"),
            "text": obj.get("text"),
            "var_date": obj.get("date")
        })
        return _obj

