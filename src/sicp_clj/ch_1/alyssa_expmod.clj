(ns sicp-clj.ch-1.alyssa-expmod 
  (:require
    [sicp-clj.ch-1.fast-expt :as fast-expt]))

(defn alyssa-expmod [base exp m]
  (mod (fast-expt/fast-expt base exp) m))
