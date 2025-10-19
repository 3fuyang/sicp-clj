(ns sicp-clj.ch-2.2-25
  (:require [sicp-clj.ch-2.list :refer [car, cdr, cadr]]))

;; (1 3 (5 7) 9)
(def t1 "I write, I pick"
  (list 1 3 (list 5 7) 9))

(defn pick-7-1 [x]
  (cadr (cadr (cdr x))))

;; ((7))
(def t2
  (list (list 7)))

(defn pick-7-2 [x]
  (car (car x)))

;; (1 (2 (3 (4 (5 (6 7))))))
(def t3
  (list 1
           (list 2
                    (list 3
                             (list 4
                                      (list 5
                                               (list 6 7)))))))

(defn pick-7-3 [x]
  (cadr (cadr (cadr (cadr (cadr x))))))

(println (pick-7-1 t1))
(println (pick-7-2 t2))
(println (pick-7-3 t3))
