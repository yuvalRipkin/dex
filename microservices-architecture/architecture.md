# Microservices atchitecture
1. IAM microservice - responsible for the login & register processes
2. UserDetails - responsible for all the business logic of data retrieval of each person that the user
 is looking for details about him. (That MS Will include the id validation, work list, income and general details about the person)

#DB model 
CQRS - I chose CQRS model because of its ability to create optimized read models for complex or high-volume queries. This ensures that your queries are as efficient as possible.
Moreover, it provides flexibility for change or add queries.
also the separation of the read and write operations allows the creation of specialized read models that are tailored to the specific query requirements of the application.
This separation means that the read models can be optimized for quick data retrieval.

#observability

#Integration
