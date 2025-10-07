(ns sicp-clj.ch-1.newton-method
  (:require [sicp-clj.ch-1.deriv :refer [deriv]]
            [sicp-clj.ch-1.fixed-point :refer [fixed-point]]))

(defn newton-transform [g]
  (fn [x]
    (- x (/ (g x) ((deriv g) x)))))

(defn newtons-method [g guess]
  (fixed-point (newton-transform g) guess))
