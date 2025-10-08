(ns sicp-clj.ch-2.2-12
  (:require [sicp-clj.ch-2.2-7 :refer [make-interval, lower-bound, upper-bound]]))

(defn make-center-percent [c p]
  (let [w (* c (/ p 100))]
    (make-interval (- c w)
                   (+ c w))))

(defn center [i]
  (/ (+ (lower-bound i) 
        (upper-bound i)) 
     2))

(defn width [i]
  (/ (- (lower-bound i) (upper-bound i)) 2))

(defn percent [i]
  (* (/ (width i) (center i)) 100))
