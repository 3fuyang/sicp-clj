(ns sicp-clj.ch-2.2-2
  (:require [sicp-clj.utils.pair :refer [my-cons, car, cdr]]
            [sicp-clj.utils.math :refer [average]]))

(defn make-point [x y]
  (my-cons x y))

(defn x-point [p]
  (car p))

(defn y-point [p]
  (cdr p))

(defn print-point [p]
  (newline)
  (print "(")
  (print (x-point p))
  (print ",")
  (print (y-point p))
  (print ")"))

(defn make-segment [ps pe]
  (my-cons ps pe))

(defn start-segment [s]
  (car s))

(defn end-segment [s]
  (cdr s))

(defn midpoint-segment [s]
  (let [x-mid (average (x-point (start-segment s))
                       (x-point (end-segment s)))
        y-mid (average (y-point (start-segment s))
                       (y-point (end-segment s)))]
    (make-point x-mid y-mid)))

(def s (make-segment (make-point 2 4) (make-point 6 8)))
(print-point (midpoint-segment s))
