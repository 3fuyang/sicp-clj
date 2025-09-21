(ns sicp-clj.ch-1.timed-prime-test 
  (:require
   [sicp-clj.ch-1.prime :as prime]))

(defn report-prime [elapsed-time]
  (println " *** ")
  (println elapsed-time))

(defn start-prime-test [n start-time]
  (if (prime/prime? n)
    (report-prime (- (System/nanoTime) start-time))
    nil))

(defn timed-prime-test [n]
  (newline)
  (println n)
  (start-prime-test n (System/nanoTime)))
