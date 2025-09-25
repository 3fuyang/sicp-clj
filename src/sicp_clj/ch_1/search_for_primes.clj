(ns sicp-clj.ch-1.search-for-primes)

(defn divides? [a b]
  (= (mod b a) 0))

(defn next-candidate [n]
  (if (= n 2) 3 (+ n 2)))

(defn find-divisor [n test-divisor]
  (cond (> (* test-divisor test-divisor) n) n
        (divides? test-divisor n) test-divisor
        :else (find-divisor n (next-candidate test-divisor))))

(defn smallest-divisor [n]
  (find-divisor n 2))

(defn prime? [n]
  (= (smallest-divisor n) n))
