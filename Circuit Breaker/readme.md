https://spring.io/guides/gs/circuit-breaker/


You’ll build a microservice application that uses the Circuit Breaker pattern to gracefully degrade functionality when a method call fails. Use of the Circuit Breaker pattern can allow a microservice to continue operating when a related service fails, preventing the failure from cascading and giving the failing service time to recover.




# Apply the Circuit Breaker pattern

Netflix’s Hystrix library provides an implementation of the Circuit Breaker pattern: when we apply a circuit breaker to a method, Hystrix watches for failing calls to that method, and if failures build up to a threshold, Hystrix opens the circuit so that subsequent calls automatically fail. While the circuit is open, Hystrix redirects calls to the method, and they’re passed on to our specified fallback method.
