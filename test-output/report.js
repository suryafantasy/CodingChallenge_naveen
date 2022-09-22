$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Muthukumar/eclipse-workspace/MakeMyTrip/src/main/java/com/feature/OnlineShopping_challenge2.feature");
formatter.feature({
  "line": 2,
  "name": "Online shopping_coding challenge 2",
  "description": "",
  "id": "online-shopping-coding-challenge-2",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Add item to cart which has high pricing",
  "description": "",
  "id": "online-shopping-coding-challenge-2;add-item-to-cart-which-has-high-pricing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@addToCart"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "launch the url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "login with \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "add item with high price to cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "online-shopping-coding-challenge-2;add-item-to-cart-which-has-high-pricing;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "online-shopping-coding-challenge-2;add-item-to-cart-which-has-high-pricing;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 14,
      "id": "online-shopping-coding-challenge-2;add-item-to-cart-which-has-high-pricing;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Add item to cart which has high pricing",
  "description": "",
  "id": "online-shopping-coding-challenge-2;add-item-to-cart-which-has-high-pricing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 7,
      "name": "@addToCart"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "launch the url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "login with \"standard_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "add item with high price to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "OnlineShopStepdef.launch_the_url()"
});
formatter.result({
  "duration": 5972091600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 32
    }
  ],
  "location": "OnlineShopStepdef.login_with_and(String,String)"
});
formatter.result({
  "duration": 418259700,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShopStepdef.add_item_with_high_price_to_cart()"
});
formatter.result({
  "duration": 243137100,
  "status": "passed"
});
});