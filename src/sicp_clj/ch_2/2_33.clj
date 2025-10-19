(ns sicp-clj.ch-2.2-33
  (:require [sicp-clj.ch-2.accumulate :refer [accumulate]]))

(defn my-map [p sequence]
  (accumulate (fn [x y]
                (cons (p x)
                      y))
              nil
              sequence))

(defn my-append [seq1 seq2]
  (accumulate cons
              seq2
              seq1))

(defn my-length [sequence]
  (accumulate (fn [_ y]
                (inc y))
              0
              sequence))
