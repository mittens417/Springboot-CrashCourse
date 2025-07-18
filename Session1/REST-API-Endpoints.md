|Resources         |HTTP Verb|Resource URL                            |Use Case                                                                                      |
|------------------|---------|----------------------------------------|----------------------------------------------------------------------------------------------|
|Visitor           |POST     |/visits                                 |A visitor enters the zoo, creating a new visit session.                                       |
|                  |GET      |/visits                                 |Admin gets a list of all active or past visit sessions.                                       |
|                  |GET      |/visits/{visitId}                       |Get details for a specific visit, like entry time and duration.                               |
|                  |DELETE   |/visits/{visitId}                       |A visitor leaves the zoo, ending and removing the active session.                             |
|Ticket            |POST     |/tickets                                |A user buys a new ticket.                                                                     |
|                  |GET      |/tickets                                |Admin gets a list of all tickets sold.                                                        |
|                  |GET      |/tickets/{ticketId}                     |Get the status and details of a specific ticket.                                              |
|                  |PATCH    |/tickets/{ticketId}                     |Partially update a ticket, such as upgrading from "Adult" to "VIP" or changing the valid date.|
|                  |DELETE   |/tickets/{ticketId}                     |A user cancels an unused ticket for a refund.                                                 |
|Shop              |POST     |/shops                                  |An Admin adds a new shop to the zoo.                                                          |
|                  |GET      |/shops                                  |Get a list of all shops in the zoo.                                                           |
|                  |GET      |/shops/{shopId}                         |Get details and items for a specific shop.                                                    |
|                  |PUT      |/shops/{shopId}                         |Admin replaces all information for a specific shop.                                           |
|                  |PATCH    |/shops/{shopId}                         |Admin partially update a shop, like changing only its name or hours.                          |
|                  |DELETE   |/shops/{shopId}                         |Admin removes a shop that has closed down.                                                    |
|Animal            |POST     |/animals                                |Zoo staff adds a new animal to the zoo's records.                                             |
|                  |GET      |/animals                                |Get a list of all animals in the zoo.                                                         |
|                  |GET      |/animals/{animalId}                     |Get the complete profile for a specific animal (species, age, habitat, etc.).                 |
|                  |PATCH    |/animals/{animalId}                     |Staff partially update an animal's record, such as its health status or location.             |
|                  |DELETE   |/animals/{animalId}                     |Satff archive the record of an animal that has been transferred or passed away.               |
|Feeding           |POST     |/animals/{animalId}/feedings            |Staff logs a new feeding event for a specific animal.                                         |
|                  |GET      |/animals/{animalId}/feedings            |Staff gets the entire feeding history for a specific animal.                                  |
|                  |DELETE   |/feedings/{feedingId}                   |Staff deletes an incorrect feeding log entry.                                                 |
|Enclosure         |POST     |/enclosures                             |Admin adds a new enclosure to the zoo map and records.                                        |
|                  |GET      |/enclosures                             |Get a list of all enclosures.                                                                 |
|                  |GET      |/enclosures/{enclosureId}               |Get details for a specific enclosure.                                                         |
|                  |PUT      |/enclosures/{enclosureId}               |Admin replaces all information for an enclosure.                                              |
|                  |PATCH    |/enclosures/{enclosureId}               |Admin updates an enclosure, like changing its description or keeper notes.                    |
|                  |DELETE   |/enclosures/{enclosureId}               |Admin remove an enclosure from the records.                                                   |
|Purchase          |POST     |/shops/{shopId}/purchases               |Make a Purchase at a specific shop. The visitor's ID would be part of the request.            |
|Hospital          |GET      |/hospital                               |Visit the Hospital to get details and information.                                            |
|Lecture Attendance|POST     |/hospital/lectures/{lectureId}/attendees|Listen to a Science Lecture, marking the visitor as an attendee.                              |
|Zoo               |GET      |/zoo                                    |Get global information about the zoo (name, hours, etc.).                                     |
|                  |HEAD     |/zoo                                    |Check if zoo information has changed (for caching) without getting the full data.             |
|                  |PUT      |/zoo                                    |Admin replaces all zoo information entirely.                                                  |
|                  |PATCH    |/zoo                                    |Admin updates zoo info, like changing only the operating hours.                               |

