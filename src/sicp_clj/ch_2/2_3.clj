(ns sicp-clj.ch-2.2-3
  (:require [sicp-clj.ch-2.2-2 :refer [x-point, y-point, make-point]]
            [sicp-clj.utils.pair :refer [my-cons, car, cdr]]))

(defn make-rect-by-corners [c1 c2]
  (my-cons c1 c2))

(defn c1-rect [rect]
  (car rect))

(defn c2-rect [rect]
  (cdr rect))

;; (defn make-rect-by-origin-and-dimensions [o w h]
;;   (my-cons o (my-cons w h)))
;; (defn origin-rect [rect]
;;   (car rect))
;; (defn dimensions-rect [rect]
;;   (cdr rect))
;; (defn width-rect [rect]
;;   (cdr (car rect)))
;; (defn height-rect [rect]
;;   (cdr (cdr rect)))

(defn width-rect [rect]
  (abs (- (x-point (c1-rect rect))
          (x-point (c2-rect rect)))))

(defn height-rect [rect]
  (abs (- (y-point (c1-rect rect))
          (y-point (c2-rect rect)))))

(defn perimeter [rect]
  (* 2 (+ (width-rect rect) (height-rect rect))))

(defn area [rect]
  (* (width-rect rect) (height-rect rect)))

(def r (make-rect-by-corners (make-point 2 4) (make-point 6 8)))
(perimeter r)
(area r)
