# destination-search

A simple API to search for the venues around any location. 

#Perequisites 

- Geolocation API key
- Foursquare Client ID and secure key

One will need to put above keys in application.properties
```
geocode.service.api.key=<GEOCODE_API_KEY>
foursquare.client.id=<FOURSQUARE-CLIENT-ID>
foursquare.client.secret=<FOURSQUARE-CLIENT-SECRET>
```

# Sample API request -
Requred header -
- 'X-API-VERSION' with value 1
```json
{
	"city":"Nagpur",
	"query":"Nagpur",
	"filters":{
		"onlyAreaDetail":false,
		"category": "Office"
	}
}
```

# Sample Response -
```json
{
    "status": "OK",
    "searchResults": [
        {
            "address": "Nagpur, Mahārāshtra, India",
            "location": {
                "lat": 21.14631,
                "lng": 79.08491
            },
            "venues": [
                {
                    "id": "4edf0479991168b1095946fd",
                    "name": "New Nagpur Travels",
                    "location": {
                        "address": "Old SitaBuildi",
                        "lat": 21.145771445584106,
                        "lng": 79.08719705650864,
                        "labeledLatLngs": [
                            {
                                "label": "display",
                                "lat": 21.145771445584106,
                                "lng": 79.08719705650864
                            }
                        ],
                        "cc": "IN",
                        "city": "Nagpur",
                        "state": "Mahārāshtra",
                        "country": "India",
                        "formattedAddress": [
                            "Old SitaBuildi",
                            "Nagpur",
                            "Mahārāshtra",
                            "India"
                        ]
                    },
                    "categories": [
                        {
                            "id": "4bf58dd8d48988d124941735",
                            "name": "Office",
                            "pluralName": "Offices",
                            "shortName": "Office",
                            "icon": {
                                "prefix": "https://ss3.4sqi.net/img/categories_v2/building/default_",
                                "suffix": ".png"
                            },
                            "primary": true
                        }
                    ],
                    "referralId": "v-1557567012",
                    "hasPerk": false
                },
                {
                    "id": "511f4b6ee4b03a91c90b7bb4",
                    "name": "HPCL Nagpur RO",
                    "location": {
                        "lat": 21.155139923095703,
                        "lng": 79.08047485351562,
                        "labeledLatLngs": [
                            {
                                "label": "display",
                                "lat": 21.155139923095703,
                                "lng": 79.08047485351562
                            }
                        ],
                        "cc": "IN",
                        "country": "India",
                        "formattedAddress": [
                            "India"
                        ]
                    },
                    "categories": [
                        {
                            "id": "5032764e91d4c4b30a586d5a",
                            "name": "Campaign Office",
                            "pluralName": "Campaign Offices",
                            "shortName": "Campaign",
                            "icon": {
                                "prefix": "https://ss3.4sqi.net/img/categories_v2/building/default_",
                                "suffix": ".png"
                            },
                            "primary": true
                        }
                    ],
                    "referralId": "v-1557567012",
                    "hasPerk": false
                }
            ]
        }
    ]
}
```