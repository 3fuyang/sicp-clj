(ns sicp-clj.ch-2.2-27
  (:require ))

(defn deep-reverse [x]
  (defn deep-reverse-helper [l rs]
    (if (list? l) (deep-reverse-helper)))
  (if (list? x) (deep-reverse)
      x))

(def x "((1 2) (3 4))"
  (list (list 1 2) (list 3 4)))
