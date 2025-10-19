(ns sicp-clj.ch-2.2-29
  (:require [sicp-clj.ch-2.list :refer [car, cadr]]))

(defn make-mobile [left right]
  (list left right))
(defn make-branch [length structure]
  (list length structure))

(defn left-branch [mobile]
  (car mobile))
(defn right-branch [mobile]
  (cadr mobile))

(defn branch-length [branch]
  (car branch))
(defn branch-structure [branch]
  (cadr branch))

(declare total-weight)
(defn branch-weight [branch]
  (let [struct (branch-structure branch)]
    (if (not (list? struct))
          struct
          (total-weight struct))))
(defn total-weight [mobile]
  (+ (branch-weight (left-branch mobile))
     (branch-weight (right-branch mobile))))

(def mobile (make-mobile (make-branch 10 20) (make-branch 30 40)))
(println (total-weight mobile))

(defn torque [branch]
  (* (branch-length branch)
     (branch-weight branch)))

(declare mobile-balanced?)
(defn branch-balanced? [branch]
  (let [struct (branch-structure branch)]
    (if (not (list? struct)) true
        (mobile-balanced? struct))))
(defn mobile-balanced? [mobile]
  (and (= (torque (left-branch mobile))
          (torque (right-branch mobile)))
       (branch-balanced? (left-branch mobile))
       (branch-balanced? (right-branch mobile))))

(println (mobile-balanced? mobile))
(def b "balanced mobile"
  (make-mobile (make-branch 10 (make-mobile (make-branch 10 10) (make-branch 10 10)))
               (make-branch 10 (make-mobile (make-branch 10 10) (make-branch 10 10)))))
(println (mobile-balanced? b))
