(ns sicp-clj.ch-2.2-8
  (:require [sicp-clj.ch-2.2-7 :refer [make-interval, lower-bound, upper-bound]]))

(defn sub-interval [x y]
  (make-interval (- (lower-bound x) (upper-bound y))
                 (- (upper-bound x) (lower-bound y))))
