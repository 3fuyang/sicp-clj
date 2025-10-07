(ns sicp-clj.ch-2.2-5 
  (:require
    [clojure.math :as math]))

(defn _cons [a b]
  (* (math/pow 2 a)
     (math/pow 3 b)))

(defn log [n p]
  (defn it [m k]
    (if (= (mod m p) 0)
     (it (/ m p) (inc k))
     k))
  (it n 0))

(defn car [z]
  (log z 2))
