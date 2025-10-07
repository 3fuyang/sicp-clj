(ns sicp-clj.ch-2.rat
  (:require [sicp-clj.utils.pair :refer [my-cons, car, cdr]]
            [sicp-clj.ch-1.gcd :refer [gcd]]))

(defn make-rat [n d]
  (let [g (gcd n d)]
    (my-cons (/ n g)
             (/ d g))))

(defn numer [x] (car x))

(defn denom [x] (cdr x))

(defn add-rat [x y]
  (make-rat (+ (* (numer x) (denom y))
               (* (numer y) (denom x)))
            (* (denom x) (denom y))))

(defn sub-rat [x y]
  (make-rat (- (* (numer x) (denom y))
               (* (numer y) (denom x)))
            (* (denom x) (denom y))))

(defn mul-rat [x y]
  (make-rat (* (numer x) (numer y))
            (* (denom x) (denom y))))

(defn div-rat [x y]
  (make-rat (* (numer x) (denom y))
            (* (denom x) (numer y))))

(defn eq-rat? [x y]
  (= (* (numer x) (denom y))
     (* (denom x) (numer y))))

(defn print-rat [x]
  (newline)
  (print (numer x))
  (print "/")
  (print (denom x)))

(def one-half (make-rat 1 2))
(print-rat one-half)
(def one-third (make-rat 1 3))
(print-rat one-third)
(print-rat (mul-rat one-half one-third))
(print-rat (add-rat one-third one-third))
