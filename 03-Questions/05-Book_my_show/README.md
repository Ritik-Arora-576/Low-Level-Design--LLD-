# Book My Show

User enters its location and according to its location movies will be listed. User will select its movie which they wish to see and it will select the theatre in which the movie is listed. Then user will select the seat and pay the amount. After paying the amount, ticket will be selected.

### Concurrency handling
1. Two different user must not book same seat
2. If one user selects one seat or if payment gets failed then for 10 minutes seat remains booked in order to handle concurrency

1. **Pessimistic Locking:** In this type of locking, if multiple users wants to read seat booking status then it allows only one user to read the status and rest of the users gets locked and queued into a line. Once the user booked the seat then it will another user to read the status.

2. **Optimistic Locking:** In this type of locking, if multiple users wants to read seat booking status then it allows all the users to read the status and when one user selects the seat and book that seat then we have to check whether those seats are booked by someone else or not. If it is booked or locked then requests gets cancelled otherwise it will locked those seats and update the version of those seats and proceed to the payment state.

For concurrency handling, we use **Optimistic Locking** because if we use Pessimistic locking then in the case of high traffic it will block all other users to read the seat booking status which results into unefficient utilization of resources and high waiting time for users which degrades user experience.

In the case of payment failure or other issues, we have to lock the seats for 10 minutes. In order to implement this, we can use **Redis** to keep the track of locking of seats.

### Objects:
1. User
2. Movie
3. Theatre
4. Hall
5. Show
6. Seat
7. PaymentStrategy
8. Ticket
9. MovieController
10. Category (enum) -> SILVER, GOLD, PLATINUM
11. TheatreController
12. Booking
13. City (enum) -> DELHI, BANGALORE, MUMBAI, KOLKATA
14. BookMyShow

### Movie
1. int id
2. String movie_name
3. int duration
4. String description
5. Getters and Setters

### Movie Controller
1. Map(City, Movie) cityVsMovie
2. List(Movie) all_movies
3. addMovie(Movie movie, City city)
4. removeMovie(Movie movie)
5. getMovie(Movie movie)

### Theatre
1. int id
2. String name
3. String adrress
4. City city
5. List(Screen) screens
6. List(Show) shows
7. addScreen(Screen screen)
8. removeScreen(Screen screen)
9. addShow(Show show)
10. removeShow(Show show)

### Screen
1. int id
2. List(Seat) seats
3. addSeat(Seat seat)
4. removeSeat(Seat seat)

### Show
1. int id
2. Movie movie
3. Screen screen
4. int startTime
5. List(int) bookedSeatsIDs
6. Define getters and setters

### Seat
1. int id
2. int row
3. Category category

### Theatre Controller
1. Map(City, Theatre) cityVsTheatre
2. List(Theatre) all_theatre
3. addTheatre(Theatre theatre, City city)
4. removeTheatre(Theatre theatre)

### Booking
1. List(Seat) bookingSeats
2. PaymentStrategy strategy
3. Show show
4. bookShow()
5. doPayment()

### BookMyShow
1. MovieController movieController
2. TheatreController theatreController