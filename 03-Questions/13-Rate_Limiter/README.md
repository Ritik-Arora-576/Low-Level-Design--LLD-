# Rate Limiter

There might be some DDoS attack (intensionally increases the traffic of the system) that could happen upon a particular website in order to exhaust the resources like RAM and disc which may result into downtime of the website in order to degrade company's reputation. So in order to counter DDoS attack, Rate Limiter limits the request upon the server.

### Different Algorithms
1. Token Bucket
2. Leaky Bucket
3. Fixed Window Counter
4. Sliding Window Counter
5. Sliding Window Log

### Token Bucket

1. **Token Generation:** Tokens are generated at a constant rate and are placed in the "bucket." Each token typically represents permission to send a fixed amount of data (like one packet or a specific number of bytes).

2. **Bucket Size:** The bucket has a maximum capacity, meaning it can only hold a certain number of tokens. If the bucket is full, any new tokens generated are discarded.

3. **Data Sending:** When a device or user wants to send data, it must first "consume" tokens from the bucket. Each unit of data requires a token to be sent. If there are tokens available, the data can be transmitted, and the corresponding tokens are removed from the bucket.

4. **Overflow Handling:** If there are no tokens in the bucket (because the sending rate is too high or the tokens have been used up), the data transmission is delayed until new tokens become available.

**Bucket Capacity:** 3 counters
**Refilling Speed:** 2 counters/user/min
Each user has its own counters and timestamp.

### Leaky Bucket

Leaky bucket algorithm uses queue data structure. Queue has some capacity and at some rate request is adding into queue and at some rate old requests are also deleting from the queue. While pushing the request into queue if queue has reached its maximum capacity then request gets denied otherwise request gets fulfilled.

### Fixed Window Counter

We split timeframe into fixed segments and in each segments specific amount of counters are added.

### Sliding Window log

We add timestamps in queue at which request is coming if current timestamp crosses the threshold time then we remove the timestamp from queue by comparing it with front element after that we check if queue has capacity or not. If there is some capacity then request gets fulfilled otherwise request gets denied.

### Sliding Window Counter

Fixed Window Counter + Sliding Window log