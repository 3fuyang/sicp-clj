(ns sicp-clj.ch-2.2-10
  (:require [sicp-clj.ch-2.2-7 :refer [make-interval, upper-bound, lower-bound, mul-interval]]))

(defn div-interval [x y]
  (let [lower-y (lower-bound y)
        upper-y (upper-bound y)]
    (if (< lower-y 0 upper-y)
    (throw (IllegalArgumentException. (str "cannot divide by an interval that spans zero (" lower-y "," upper-y ")")))
    (mul-interval x
                (make-interval
                 (/ 1.0 upper-y)
                 (/ 1.0 lower-y))))))
