(ns sicp-clj.ch-1.excs-new-if
  (:require [sicp-clj.ch-1.sqrt :refer [good-enough? improve]]))

(defn new-if [predicate then-clause else-clause]
  (cond
    predicate then-clause
    :else else-clause))

(defn new-sqrt-iter "Wtf? Eva!" [guess x]
  ;; all arguments evaluated before entering `new-if`
  ;; causing infinite loop
  (new-if (good-enough? guess x)
          guess
          (new-sqrt-iter (improve guess x) x)))

(defn new-sqrt [x]
  (new-sqrt-iter 1.0 x))
