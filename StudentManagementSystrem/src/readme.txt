->Advantages:
		Separation of concerns: Each layer has its own responsibility
		Maintainability: easy to change one layer without affecting other
		Testability: Each layer can be tested independently.
		Scalability: Easy to scale business logic, entities also able to switch from list or database to database
		
		
SingleTon pattern		
Problem Statement:
Imagine you are building a large application and you want to log all events into a file or database.Creating multiple logger objct
could lead to conflicts like writing simultaneously,unnecessary memory usage etc.

Imagine you are performing employee management related task and you want to perform all CRUD operation.Creating multiple
JDBC or connection to database instance could lead to performing these operation at multiple times eventually there is lot of database usage increase
load on server etc